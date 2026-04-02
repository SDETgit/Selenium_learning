package S003_Dynamic_items;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Do not make xpath based on text because during execution it will change
public class S003_Add_to_cart {

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		//This is applied globally to all instances of driver  
		//it will wait for 5 seconds atleasr before thowing the error 
		String a[] = { "Brocolli", "Cauliflower", "Cucumber" };

		addItems(driver, a);
		
		driver.findElement(By.cssSelector("img[src=\"https://rahulshettyacademy.com/seleniumPractise/images/bag.png\"]")).click();
		
		driver.findElement(By.xpath("//div[@class=\"action-block\"]/button[text()=\"PROCEED TO CHECKOUT\"]")).click();
		
		driver.findElement(By.cssSelector("input[class=\"promoCode\"]")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.xpath("//button[text()=\"Apply\"]")).click();  
		
		String promo = 
		driver.findElement(By.xpath("//span[@class=\"promoInfo\"]")).getText();
		
		System.out.println(promo);
		driver.findElement(By.xpath("//button[text()=\"Place Order\"]")).click();
		

	}

}
