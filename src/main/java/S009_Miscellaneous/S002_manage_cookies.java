package S009_Miscellaneous;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//Do not make xpath based on text because during execution it will change
public class S002_manage_cookies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	
	
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().window().fullscreen();
		//driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(1024, 768));
		//driver.manage().window().setPosition(new Point(100, 200));
		Set<Cookie> cookies = driver.manage().getCookies();
	
		//Adding cookies
//		Cookie cookie = new Cookie("name", "value");
		//	driver.manage().addCookie(cookie);
		//Cookie c = driver.manage().getCookieNamed("name");
		//driver.manage().deleteCookieNamed("name");
		Thread.sleep(2000);
		driver.get("https://google.com/"); 
		System.out.println(cookies);
		//https://badssl.com/
		
		//driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		//Java script 
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
	}

}
