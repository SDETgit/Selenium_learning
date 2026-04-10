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
public class S001_Streams_list_compare {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// This is applied globally to all instances of driver
		// it will wait for 5 seconds atleasr before thowing the error

		driver.findElement(By.xpath("//tr/th[1]")).click();

		List<WebElement> col1 = driver.findElements(By.xpath("//tr/td[1]"));

		List<String> cole_text = col1.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> rows = cole_text.stream().sorted().collect(Collectors.toList());

		Assert.assertEquals(rows, cole_text);

		System.out.println(rows + "+" + cole_text);
		
	}
}
