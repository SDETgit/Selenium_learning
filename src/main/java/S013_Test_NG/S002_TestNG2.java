package S013_Test_NG;

import java.time.Duration;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import lombok.With;

//Do not make xpath based on text because during execution it will change
public class S002_TestNG2 {
	@Parameters ({"url","browser"}) 
	@Test (priority = 1, groups = {"Smoke"})
	public void WebTest1(String browser, String url ) {

		System.out.println("Web1");
		System.out.println("Web1"+browser+ " " + url);

	}

	@Test(groups = {"Regression"})
	public void WebTest2() {

		System.out.println("Web2");

	}

	@Test(groups = {"Smoke"})
	public void MobTest1() {

		System.out.println("MOb1Smoke");

	}

	@Test(groups = {"Regression","Smoke"})
	public void APITest() {

		System.out.println("APITestSmoke_Regression");

	}
		
	@Test(dataProvider = "getData")
	public void dataproviders(String username, String password) {
		System.out.println("This is dataprovider");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider 
	public Object[][] getData(){
		
		Object[][] data = new Object[3][2];
		
		//1st Set 
		data[0][0] = "Username1";
		data[0][1] = "Password1";
		//2nd Set
		data[1][0] = "Username2";
		data[1][1] = "Password2";
		//3rd Set
		data[2][0] = "Username2";
		data[2][1] = "Password2";
		return data;
		
	}
	
}
