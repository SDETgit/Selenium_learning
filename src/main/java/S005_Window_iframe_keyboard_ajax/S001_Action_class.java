package S005_Window_iframe_keyboard_ajax;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Do not make xpath based on text because during execution it will change
public class S001_Action_class {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		//This is applied globally to all instances of driver  
		//it will wait for 5 seconds atleasr before thowing the error 
		
		
		Actions ac = new Actions(driver);
		
		WebElement login = 
		driver.findElement(By.xpath("//div[@id=\"nav-link-accountList\"]"));
		
		//movetoElement
		ac.moveToElement(login).perform();
		
		//rightCLick 
		ac.contextClick(login).perform();
		
		
		WebElement search_Bar= 
		driver.findElement(By.xpath("//*[@type=\"text\" and @id=\"twotabsearchtextbox\"]"));
		
		ac.click(search_Bar);
		ac.moveToElement(search_Bar).keyDown(Keys.SHIFT).sendKeys("Hello").build().perform();
		//double click
		ac.moveToElement(search_Bar).doubleClick().perform();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		WebElement drag = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement drop = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		//drag and drop
		ac.dragAndDrop(drag, drop).perform();
		
		
		//using clickandHold
		driver.navigate().refresh();
		
		WebElement drag1 = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement drop1 = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"draggable\"]")));

		ac.clickAndHold(drag1).moveToElement(drop1).release().build().perform();
		

		driver.get("https://quickdiff.net/");
		
		Actions act = new Actions(driver);
		WebElement text1 = driver.findElement(By.xpath("//*[@class=\"textarea_left\"]"));
		WebElement text2 = driver.findElement(By.xpath("//*[@class=\"textarea_right\"]"));
		
		act.moveToElement(text1).click().sendKeys("ABds ").build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("A").sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		act.moveToElement(text2).click().keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		
		/*
		 * act.moveToElement(text1).click().sendKeys("ABds ").keyDown(Keys.CONTROL).
		 * sendKeys("A").sendKeys("C").keyUp(Keys.CONTROL).
		 * moveToElement(text2).click().keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.
		 * CONTROL).build().perform();
		 */
	}

}
