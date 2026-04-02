package S002_Checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S001_Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");

		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement ff = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		ff.click();
		
		System.out.println(ff.isEnabled());
		System.out.println(ff.isSelected());
		
		System.out.println(ff.isDisplayed());
		
		
		
		int a = driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size();
		
		System.out.println(a);
	}

}
