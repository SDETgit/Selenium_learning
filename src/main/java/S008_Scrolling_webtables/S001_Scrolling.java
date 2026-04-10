package S008_Scrolling_webtables;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//Do not make xpath based on text because during execution it will change
public class S001_Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)");  
		
		//In console also we can write  window.scrollBy(0,500) to check where it lands
		
		Thread.sleep(3000);
		
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop =5000");  
		
		
		List<WebElement> colmn= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		
		int sum = 0;
		for(int i=0;i<colmn.size();i++)
		{
			sum+=Integer.parseInt(colmn.get(i).getText());
		}
		
		System.out.println(sum);
		
		String total = driver.findElement(By.cssSelector(".totalAmount")).getText();
		
		String a[] = total.split(": ");
		System.out.println(a[1]);
		Assert.assertEquals(Integer.parseInt(a[1]), sum);
		
	}

}
