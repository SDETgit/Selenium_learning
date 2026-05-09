package S012_Selenium_4_new_features;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import lombok.With;

//Do not make xpath based on text because during execution it will change
public class S004_width_depth_dimension {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> windowhandles = driver.getWindowHandles();
		 
		Iterator<String> it = windowhandles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		
		driver.get("https://rahulshettyacademy.com/learning-paths");
		
		WebElement ab  =driver.findElement(By.xpath("(//div[@class=\"rounded-lg border bg-card text-card-foreground shadow-sm relative overflow-hidden hover:shadow-lg transition-shadow cursor-pointer\"])[1]"));
		//above
		String text = ab.getText();
		
		driver.switchTo().window(parentWindow);
		
		WebElement name = driver.findElement(By.xpath("//input[@name=\"name\"]"));
		name.sendKeys(text);
		
		File file = name.getScreenshotAs(OutputType.FILE);
		
		
		FileUtils.copyFile(file, new File("name.png"));
		
		//driver.manage().window().maximize();
		//for dimensions
		//dimensions changes with screensize 
		//on normal window output 
		//38
		//930
		
		//on maximise out put 
		//38
		//1110
		System.out.println(name.getRect().getDimension().getHeight());
		
		System.out.println(name.getRect().getDimension().getWidth());
		
		driver.quit();
		
		
	}

}
