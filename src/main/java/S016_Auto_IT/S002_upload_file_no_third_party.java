package S016_Auto_IT;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//Do not make xpath based on text because during execution it will change
public class S002_upload_file_no_third_party {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement upload = driver.findElement(By.id("file-upload"));

		upload.sendKeys("C:\\Users\\DELL\\Desktop\\test.txt");
		
		driver.findElement(By.xpath("//input[@class=\"button\"]")).click();
		
		

	}

}
