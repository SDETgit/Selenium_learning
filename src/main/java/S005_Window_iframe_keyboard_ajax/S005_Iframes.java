package S005_Window_iframe_keyboard_ajax;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Do not make xpath based on text because during execution it will change
public class S005_Iframes {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/droppable/");
		
		//driver.switchTo().frame(driver.findElement( By.cssSelector("iframe[class=\"demo-frame\"]")));
		driver.switchTo().frame(0);
		
		
		Actions a = new Actions(driver);
		
		WebElement drag = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement drop = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		a.dragAndDrop(drag, drop).perform();
		
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
	}

}
