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
public class S002_Streams_custom_methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// This is applied globally to all instances of driver
		// it will wait for 5 seconds atleasr before thowing the error

		driver.findElement(By.xpath("//tr/th[1]")).click();

		List<WebElement> col1 = driver.findElements(By.xpath("//tr/td[1]"));


		//Filter 
		
		List<String> price = col1.stream().filter(s -> s.getText().contains("Banana"))
				.map(s -> getPriceVeggie(s)).collect(Collectors.toList());
		
		price.forEach(s->System.out.println(s));
	}

	public static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String privevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return privevalue;
	}

}
