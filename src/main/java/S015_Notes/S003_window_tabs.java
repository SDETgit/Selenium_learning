package S015_Notes;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

//Do not make xpath based on text because during execution it will change
public class S003_window_tabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		
		
		//For single extension 
		//option.addExtensions(file);
		
		//for multiple extension 
		
		 ChromeDriver driver = new ChromeDriver(option) ;
		 driver.get("https://www.udemy.com/"); //Udemy: Online Courses for Skills, Careers & AI
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled"); 
		//W3Schools Tryit Editor
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		driver.switchTo().defaultContent();
		driver.get("https://www.w3schools.com");
		//W3Schools Online Web Tutorials
		//dTextField.sendKeys("Text ");
		
		Set<String> handles = driver.getWindowHandles();
		
		for(String a : handles)
		{
			if(driver.switchTo().window(a).getTitle().equalsIgnoreCase("Udemy: Online Courses for Skills, Careers & AI"))
			{
				driver.switchTo().window(a);
				 driver.get("https://www.google.com/");
				break;
			}
		}
	}

}
