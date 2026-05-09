package S015_Notes;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

//Do not make xpath based on text because during execution it will change
public class S002_disabled_element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		File file = new File("D:\\Slelnium\\AdGuard-AdBlocker-Chrome-Web-Store.crx");
	
		List<File> paths = new ArrayList<File>();
		
		paths.add(file);
		
		//For single extension 
		//option.addExtensions(file);
		
		//for multiple extension 
		option.addExtensions(paths);
		 ChromeDriver driver = new ChromeDriver(option) ;

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame("iframeResult");
		WebElement dTextField = driver.findElement(By.id("lname"));
		System.out.println("Displayed " + dTextField.isDisplayed());
		System.out.println("Enabled " + dTextField.isEnabled());
		System.out.println("Selected " + dTextField.isSelected());
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Remove disabled attribute
		js.executeScript("document.getElementById('lname').removeAttribute('disabled')");

		dTextField.sendKeys("Now works");
		
		System.out.println("Displayed " + dTextField.isDisplayed());
		System.out.println("Enabled " + dTextField.isEnabled());
		System.out.println("Selected " + dTextField.isSelected());
		//dTextField.sendKeys("Text ");
	}

}
