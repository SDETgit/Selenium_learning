package S004_Synchronization;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//Do not make xpath based on text because during execution it will change
public class S003_Assignment3 {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/ ");

		
		

		driver.findElement( By.cssSelector("input[id=\"username\"]")).sendKeys("rahulshettyacademy");
		driver.findElement( By.cssSelector("input[name=\"password\"]")).sendKeys("Learning@830$3mK2");
		driver.findElement( By.xpath("//label[2]//span[2]")).click();
		
	//	System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement drop = 
		driver.findElement( By.xpath("//select[@class=\"form-control\"]"));
		
		Select s = new Select(drop);
		
		s.selectByValue("consult");
		
		driver.findElement( By.xpath("//input[@type=\"checkbox\"]")).click();
		
		
		driver.findElement( By.xpath("//input[@id=\"signInBtn\"]")).click();
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@class='btn btn-info']")));
		//-----------------------------------
		//page 2 
		List<WebElement> add = 
		driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		
		for(int i=0;i<add.size();i++)
		{
			add.get(i).click();
		}

		driver.findElement(By.xpath("//a[@class=\"nav-link btn btn-primary\"]")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"btn btn-success\"]")));
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]")).click();
		
		driver.findElement(By.xpath("//input[@class=\"validate filter-input form-control ng-untouched ng-pristine ng-valid\"]")).sendKeys("India");
		
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//a[normalize-space()='India'])[1]")));
		driver.findElement(By.xpath("(//a[normalize-space()='India'])[1]")).click();
		
		
		//driver.findElement(By.xpath("//input[@id=\"checkbox2\"]")).click();
		
		driver.findElement(By.xpath("//input[@class=\"btn btn-success btn-lg\"]")).click();
		
		driver.close();

	}

}
