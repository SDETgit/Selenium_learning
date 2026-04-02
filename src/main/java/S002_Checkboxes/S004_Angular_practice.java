package S002_Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class S004_Angular_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		
		
		driver.findElement(By.xpath("//input[@class=\"form-control ng-untouched ng-pristine ng-invalid\"]")).sendKeys("SJ");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("abc@nmn.com");
		driver.findElement(By.xpath("//input[@class=\"form-control\" and @id=\"exampleInputPassword1\"]")).sendKeys("4309jjsdkdjl");
		driver.findElement(By.xpath("//input[@class=\"form-check-input\" and @id=\"exampleCheck1\"]")).click();
		
		WebElement as = 
		driver.findElement(By.xpath("//*[@id=\"exampleFormControlSelect1\"]"));
		
		Select s = new Select(as);
		s.selectByVisibleText("Female");
		
		
		driver.findElement(By.xpath("//input[@id=\"inlineRadio1\"]")).click();
		
		driver.findElement(By.xpath("//input[@type=\"date\"]")).sendKeys("12/12/2010");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		String a =driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText();
		
		System.out.println(a);

		
		
	}

}
