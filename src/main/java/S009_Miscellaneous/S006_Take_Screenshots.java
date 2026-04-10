package S009_Miscellaneous;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class S006_Take_Screenshots {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException, IOException {
	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.w3schools.com/java/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		 File src = ts.getScreenshotAs(OutputType.FILE);
		// Create timestamp
		 String timestamp = LocalDateTime.now()
		         .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

		 // Define destination with timestamp
		 File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\selenium_rs\\Screenshots\\Screenshot_" 
		         + timestamp + ".png");

		 // Copy file
		 FileUtils.copyFile(src, dest);
		 
		 //Take full screen shot
		 Screenshot screenshot = new AShot()
			        .shootingStrategy(ShootingStrategies.viewportPasting(1000))
			        .takeScreenshot(driver);
		
		 File file = new File("C:\\Users\\DELL\\eclipse-workspace\\selenium_rs\\Screenshots\\fullpage_" 
			        + timestamp + ".png"); 
		 
		 ImageIO.write(screenshot.getImage(), "PNG", file);
	
	}}																					
