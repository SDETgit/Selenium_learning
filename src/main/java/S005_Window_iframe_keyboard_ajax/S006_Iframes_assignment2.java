package S005_Window_iframe_keyboard_ajax;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Do not make xpath based on text because during execution it will change
public class S006_Iframes_assignment2 {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		//driver.switchTo().frame(driver.findElement( By.cssSelector("iframe[class=\"demo-frame\"]")));
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		
		
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
	
	}

}
