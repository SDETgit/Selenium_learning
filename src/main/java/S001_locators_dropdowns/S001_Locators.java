package S001_locators_dropdowns;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import org.testng.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class S001_Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		WebElement username = driver.findElement(By.id("inputUsername"));

		System.out.println(username.getAttribute("value"));
		username.clear();
		username.sendKeys("Rahul");

		WebElement password = driver.findElement(By.name("inputPassword"));

		password.sendKeys("ajfapsjdap");

		WebElement button = driver.findElement(By.className("submit"));
		button.click();

		Thread.sleep(2000);

		String text = driver.findElement(By.cssSelector("p.error")).getText();

		System.out.println(text);

		Thread.sleep(2000);

		WebElement error = driver.findElement(By.linkText("Forgot your password?"));
		error.click();

		WebElement Username_r = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		Username_r.sendKeys("John");

		Thread.sleep(2000);

		WebElement pass_r = driver.findElement(By.xpath("//input[@type='text'][2]"));
		pass_r.sendKeys("Abs@abs.com");

		Thread.sleep(2000);
		WebElement number = driver.findElement(By.xpath("//form/input[3]"));
		number.sendKeys("98789465415");

		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		Thread.sleep(2000);

		String text2 = driver.findElement(By.cssSelector("form p")).getText();

		System.out.println(text2);

		String b[] = text2.split("'");

		System.out.println(Arrays.toString(b));

		String password_e = b[1];

		System.out.println(password_e);

		driver.findElement(By.xpath("//*[@class='go-to-login-btn']")).click();
		
		Thread.sleep(1000);
		username.sendKeys("John");
		password.sendKeys(password_e);
		
		button.click();
		
		Thread.sleep(1000);
		
		String text3= driver.findElement(By.xpath("//div/p")).getText();
		
		Assert.assertEquals(text3, "You are successfully logged in.");

		//Parent sibbling locators 
		
		driver.close();
	}

}
