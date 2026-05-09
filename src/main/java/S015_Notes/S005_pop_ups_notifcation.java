package S015_Notes;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//Do not make xpath based on text because during execution it will change
public class S005_pop_ups_notifcation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 ChromeDriver driver = new ChromeDriver() ;
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://admin:admin@the-internet.herokuapp.com/"); 
		//W3Schools Tryit Editor
		driver.findElement(By.xpath("//*[contains(text(),'Basic Auth')]")).click();
		
	}

}
