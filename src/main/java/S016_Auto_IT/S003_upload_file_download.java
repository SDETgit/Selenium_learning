package S016_Auto_IT;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//Do not make xpath based on text because during execution it will change
public class S003_upload_file_download {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String downloadPath = System.getProperty("user.dir");

		System.out.println(downloadPath);

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadPath);

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.ilovepdf.com/jpg_to_pdf");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement upload = driver.findElement(By.xpath("//span[normalize-space()='Select JPG images']"));

		upload.click();

		// driver.findElement(By.xpath("//input[@class=\"button\"]")).click();

		// old way deprecated
		// Runtime.getRuntime().exec("C:\\Program Files
		// (x86)\\AutoIt3\\SciTE\\file_upload_auto_IT.exe");

		// New way
		Thread.sleep(5000);
		ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\AutoIt3\\SciTE\\file_upload_auto_IT2.exe");
		pb.start();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//span[contains(text(),'Convert to PDF')]")));

		driver.findElement(By.xpath("//span[contains(text(),'Convert to PDF')]")).click();

		By uploadAgain = By.id("pickfiles");

		wait.until(ExpectedConditions.elementToBeClickable(uploadAgain)).click();

		File f = new File(downloadPath + "/sherry-christian-8Myh76_3M2U-unsplash.pdf");

		if (f.exists())

		{

			Assert.assertTrue(f.exists());

			if (f.delete())

				System.out.println("file deleted");

		}

	}

}
