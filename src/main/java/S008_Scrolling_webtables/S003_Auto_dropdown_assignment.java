package S008_Scrolling_webtables;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//Do not make xpath based on text because during execution it will change
public class S003_Auto_dropdown_assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.className("ui-autocomplete-input")).sendKeys("uni");
		
		Thread.sleep(3000);
		List<WebElement> drop =
		driver.findElements(By.className("ui-menu-item-wrapper"));
		
		System.out.println(drop.size());
		for(int i=1;i<drop.size();i++)
		{
			String text = drop.get(i).getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("United Kingdom (UK)"))
			{
				drop.get(i).click();
				break;
			}
		}
		
		
		
		
	}

}
