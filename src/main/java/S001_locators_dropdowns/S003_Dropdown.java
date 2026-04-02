package S001_locators_dropdowns;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import org.testng.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class S003_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		
		WebElement select_dr = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select s = new Select(select_dr);
		Thread.sleep(1000);
		s.selectByVisibleText("AED");
		
		Thread.sleep(1000);
		s.selectByValue("USD");
		
		Thread.sleep(1000);
		s.selectByIndex(1);
		
		/*
		 * Thread.sleep(1000); s.deselectByIndex(0); Thread.sleep(1000);
		 * s.deselectByIndex(1); Thread.sleep(1000); s.deselectByIndex(2);
		 * Thread.sleep(1000); s.deselectByIndex(3);
		 */
		//java.lang.UnsupportedOperationException: You may only deselect options of a multi-select
		
		System.out.println(s.isMultiple());
		
	}

}
