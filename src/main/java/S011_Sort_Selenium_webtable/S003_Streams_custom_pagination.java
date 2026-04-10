package S011_Sort_Selenium_webtable;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//Do not make xpath based on text because during execution it will change
public class S003_Streams_custom_pagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("search-field")).sendKeys("Rice");

		List<WebElement> col1 = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> price = col1.stream().filter(s -> s.getText().contains("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(col1.size(), price.size());
	}

}
