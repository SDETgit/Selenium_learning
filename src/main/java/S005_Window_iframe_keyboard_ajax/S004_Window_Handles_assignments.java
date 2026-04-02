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
public class S004_Window_Handles_assignments {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://the-internet.herokuapp.com/");
		
		
		driver.findElement(By.xpath("//a[contains(text(), \"Multiple Windows\")]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(), \"Click Here\")]")).click();
		
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
		String newWindow = 
		driver.findElement(By.xpath("//div[@class=\"example\"]//h3")).getText();
		
		System.out.println(newWindow);
		driver.switchTo().window(parent);
		
		System.out.println(driver.findElement(By.xpath("//div[@class=\"example\"]//h3")).getText());
		 
	}

}
