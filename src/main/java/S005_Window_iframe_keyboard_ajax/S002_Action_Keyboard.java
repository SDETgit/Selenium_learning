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
public class S002_Action_Keyboard {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://quickdiff.net/");
		
		Actions act = new Actions(driver);
		WebElement text1 = driver.findElement(By.xpath("//*[@class=\"textarea_left\"]"));
		WebElement text2 = driver.findElement(By.xpath("//*[@class=\"textarea_right\"]"));
		
		act.moveToElement(text1).click().sendKeys("ABds ").build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("A").sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		act.moveToElement(text2).click().keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		
		
		  act.moveToElement(text1).click().sendKeys("ABds ").keyDown(Keys.CONTROL).
		  sendKeys("A").sendKeys("C").keyUp(Keys.CONTROL).
		  moveToElement(text2).click().keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.
		  CONTROL).build().perform();
		 
	}

}
