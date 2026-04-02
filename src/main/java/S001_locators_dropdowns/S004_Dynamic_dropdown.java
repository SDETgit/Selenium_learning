package S001_locators_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S004_Dynamic_dropdown {
	public static void main(String[] args)  {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement sa = driver.findElement(By.xpath("//*[@name=\"ctl00_mainContent_ddl_originStation1_CTXT\"]"));
		
		sa.click();
		
		driver.findElement(By.xpath("//a[@value=\"GOI\"]")).click();
		
		driver.findElement(By.xpath("//input[@name=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]")).click();
		
				
		driver.findElement(By.xpath("(//a[@value=\"DEL\"])[2]")).click();
		
		
		//Advance way to do it no need to add [2]
		
		//driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_destinationStation1_CTXT'] //a[@value='DEL']")).click();
		

	}
}
