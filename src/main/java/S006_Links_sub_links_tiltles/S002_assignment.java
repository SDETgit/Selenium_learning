package S006_Links_sub_links_tiltles;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//Do not make xpath based on text because during execution it will change
public class S002_assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
	
		WebElement option3 = driver.findElement(By.id("checkBoxOption3"));
		option3.click();
		 String text = driver.findElement(By.xpath("//label[normalize-space()='Option3']")).getText();
		 
		 System.out.println(text);
		 
		 //id="dropdown-class-example"
		 
		 WebElement drop = driver.findElement(By.id("dropdown-class-example"));
		 
		 Select a = new Select(drop);
		 
		 a.selectByContainsVisibleText(text);
		 
		 driver.findElement(By.id("name")).sendKeys(text);
		 
		 driver.findElement(By.id("alertbtn")).click();
		 
		 
		 String text2 = driver.switchTo().alert().getText();
		 System.out.println(driver.switchTo().alert().getText());
		 
		 driver.switchTo().alert().accept();
		 String tex[] = text2.split(" ");
		 
		 String text3 = tex[1].replace(",", "");
		 
		 System.out.println(text3);
		 
		 //Assert.assertEquals(text3, text+" "); //it failed
		 Assert.assertEquals(text3, text); 
		 
		 
		 
	}

}
