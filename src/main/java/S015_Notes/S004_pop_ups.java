package S015_Notes;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//Do not make xpath based on text because during execution it will change
public class S004_pop_ups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		
		
		//For single extension 
		//option.addExtensions(file);
		
		//for multiple extension 
		
		 ChromeDriver driver = new ChromeDriver(option) ;
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://the-internet.herokuapp.com/entry_ad"); 
		//W3Schools Tryit Editor
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		WebElement popup = driver.findElement(By.xpath("//*[contains(text(),'Close')]"));
		
		WebElement p = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Close')]")));
		
		p.click();
		
		//bootstrap popups 
		driver.get("https://demoqa.com/modal-dialogs");
		
		driver.findElement(By.xpath("//button[contains(text(),'Small modal')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
		
		//alert 
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		
		Alert al = driver.switchTo().alert();
		
		System.out.println(al.getText());
		al.accept();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		al.sendKeys("Absa");
		System.out.println(al.getText());
		al.accept();
		
	}

}
