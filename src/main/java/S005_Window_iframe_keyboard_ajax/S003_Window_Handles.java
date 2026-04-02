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
public class S003_Window_Handles {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Free Access to InterviewQues/ResumeAssistance/Mate')]")).click();
		
		Set <String> windows=driver.getWindowHandles();
		
		System.out.println(windows);
		
		Iterator<String> it = windows.iterator();
		
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		/*
		 * WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		 * 
		 * w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
		 * "//a[normalize-space()='mentor@rahulshettyacademy.com']")));
		 */
		String emailID = 
		driver.findElement(By.xpath("//a[normalize-space()='mentor@rahulshettyacademy.com']")).getText();
		
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.id("username")).sendKeys(emailID);
		 System.out.println(emailID);
	}

}
