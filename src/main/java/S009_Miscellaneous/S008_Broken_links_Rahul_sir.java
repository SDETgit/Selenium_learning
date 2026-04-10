package S009_Miscellaneous;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class S008_Broken_links_Rahul_sir {
	// https://www.demoblaze.com/
	// https://artoftesting.com/samplesiteforselenium
	// https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	// https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		SoftAssert a = new SoftAssert();
		for (WebElement link : links) {
			 String url= link.getAttribute("href");

	         

	          HttpURLConnection conn = (HttpURLConnection) new URI(url).toURL().openConnection();
	          conn.setRequestMethod("HEAD");

	          conn.connect();

	          int respCode = conn.getResponseCode();

	          System.out.println(respCode);

	          a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);

	         }
		a.assertAll();
	}
}
