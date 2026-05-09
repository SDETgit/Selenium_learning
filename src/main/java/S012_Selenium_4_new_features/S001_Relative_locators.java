package S012_Selenium_4_new_features;

import java.time.Duration;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import lombok.With;

//Do not make xpath based on text because during execution it will change
public class S001_Relative_locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement textbox =  driver.findElement(By.xpath("//input[@name=\"name\"]"));
		
		//above
		String text = driver.findElement(with(By.tagName("label")).above(textbox)).getText();
		
		System.out.println(text);
		
		//below 
		WebElement dob = driver.findElement(By.xpath("//label[@for=\"dateofBirth\"]"));
		
		WebElement button2 =driver.findElement(with(By.tagName("input")).below(dob));
		System.out.println(button2.getText()+" "+button2.getTagName());
		button2.click();
		//we clicked submit one 
		
		//left of 
		WebElement text_icream = driver.findElement(By.xpath("//*[contains(text(),'Check me out if you Love IceCreams')]"));
		
		
		driver.findElement(with(By.tagName("input")).toLeftOf(text_icream)).click();
		
		//right of 
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		
		String text2 = driver.findElement(with(By.tagName("label")).toRightOf(radiobutton)).getText();
		
		System.out.println(text2);
		
		
	}

}
