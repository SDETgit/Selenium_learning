package S002_Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class S003_Assignment_checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement cb1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		cb1.click();

		Assert.assertTrue(cb1.isSelected());
		
		System.out.println(
		driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());

	}

}
