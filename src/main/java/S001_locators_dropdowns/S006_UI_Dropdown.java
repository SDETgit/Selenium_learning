package S001_locators_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S006_UI_Dropdown {
	public static void main(String[] args) throws InterruptedException  {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		
		driver.findElement(By.cssSelector(".paxinfo")).click();
		
		
		//Need to select 3 adults 1 child 1 infant 
		
		Thread.sleep(1000);
		int a = 3, c = 1 ,I = 1;
		
		for(int i=0;i<a;i++)
		{
		
		driver.findElement(By.xpath("//span[@id=\"hrefIncAdt\"]")).click();
		}
		Thread.sleep(1000);
		for(int i=0;i<c;i++)
		{
		
		driver.findElement(By.xpath("//span[@id=\"hrefIncChd\"]")).click();
		}
		Thread.sleep(1000);
		for(int i=0;i<I;i++)
		{
		
		driver.findElement(By.xpath("//span[@id=\"hrefIncInf\"]")).click();
		}
		Thread.sleep(1000);		
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"spanAudlt\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"spanChild\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"spanInfant\"]")).getText());
		
		driver.findElement(By.cssSelector("input[value='Done']")).click();
		
		
		//Advance way to do it no need to add [2]
		
		//driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_destinationStation1_CTXT'] //a[@value='DEL']")).click();
		

	}
}
