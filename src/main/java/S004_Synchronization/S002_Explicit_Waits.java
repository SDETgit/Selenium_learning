package S004_Synchronization;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Do not make xpath based on text because during execution it will change
public class S002_Explicit_Waits {

	public static void addItems(WebDriver driver, String[] a) throws InterruptedException {
		List itemsNeededList = Arrays.asList(a);

		List<WebElement> veg_name = driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));

		int j = 0;
		for (int i = 0; i < veg_name.size(); i++) {
			String name[] = veg_name.get(i).getText().split("-");

			String fName = name[0].trim();

			if (itemsNeededList.contains(fName)) {
				j++;
				Thread.sleep(3000);
				driver.findElements(By.xpath("//div[@class=\"product-action\"]//button")).get(i).click();
				if (j == itemsNeededList.size())
					break;
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String a[] = { "Brocolli", "Cauliflower", "Cucumber" };

		addItems(driver, a);

		driver.findElement(
				By.cssSelector("img[src=\"https://rahulshettyacademy.com/seleniumPractise/images/bag.png\"]")).click();

		driver.findElement(By.xpath("//div[@class=\"action-block\"]/button[text()=\"PROCEED TO CHECKOUT\"]")).click();

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class=\"promoCode\"]")));

		driver.findElement(By.cssSelector("input[class=\"promoCode\"]")).sendKeys("rahulshettyacademy");

		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Apply\"]")));
		driver.findElement(By.xpath("//button[text()=\"Apply\"]")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"promoInfo\"]")));

		String promo = driver.findElement(By.xpath("//span[@class=\"promoInfo\"]")).getText();

		System.out.println(promo);
		driver.findElement(By.xpath("//button[text()=\"Place Order\"]")).click();

	}

}
