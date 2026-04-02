package S006_Links_sub_links_tiltles;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Do not make xpath based on text because during execution it will change
public class S001_Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// total links
		System.out.println(links.size());

		// total links in footer

		WebElement footdriver = driver.findElement(By.id("gf-BIG"));

		List<WebElement> foodriver = footdriver.findElements(By.tagName("a"));

		System.out.println(foodriver.size());

		// Limiting scope of Webdriver
		// total links in footer column
		WebElement column_footer = driver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));

		List<WebElement> foot_col = column_footer.findElements(By.tagName("a"));

		System.out.println(foot_col.size());

		// need to click all 5 links
		for (int i = 0; i < foot_col.size(); i++) {
			foot_col.get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		}

		// get titles for all links opened

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}
		driver.quit();
	}

}
