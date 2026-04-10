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
public class S002_Scrolling_Webpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		
		List<WebElement> rows= driver.findElements(By.cssSelector(".table-display tr"));
		
		System.out.println("Total rows : "+rows.size());
		
		List<WebElement> cols= driver.findElements(By.xpath("//table[@id=\"product\" and @class=\"table-display\"]//tr[2]//td"));
		
		System.out.println("Total cols "+cols.size());
		
		for(int i=2;i<=rows.size();i++)
		{
			for(int j=1;j<=cols.size();j++)
			{
			String text =	driver.findElement(By.xpath("//table[@id=\"product\" and @class=\"table-display\"]//tr["+i+"]//td["+j+"]")).getText();
			if (j < cols.size()) {
	            System.out.print(text + " | ");
	        } else {
	            System.out.print(text);
	        }
			}
			System.out.println();
		}
		
	}

}
