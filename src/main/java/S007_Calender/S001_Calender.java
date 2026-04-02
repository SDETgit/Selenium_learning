package S007_Calender;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel;
import org.openqa.selenium.By;
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
public class S001_Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String monthNumber = "6";

		String date = "15";

		String year = "2027";
		
		String[] expectedList = {monthNumber,date,year};
		
		driver.findElement(By.cssSelector(".react-date-picker__calendar-button__icon")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()="+year+"]")).click();
		
		driver.findElement(By.xpath("(//button[@class=\"react-calendar__tile react-calendar__year-view__months__month\"])["+monthNumber+"]")).click();
		
		driver.findElement(By.xpath("//abbr[normalize-space()='"+date+"']")).click();
		//
		
		
		List<WebElement> datepic= driver.findElements(By.xpath("//input[@autocomplete=\"off\"]"));
		
		for(int i=0;i<datepic.size();i++)
		{
			String text = datepic.get(i).getAttribute("value");
			
			Assert.assertEquals(text, expectedList[i]);
			
		}
		
	}

}
