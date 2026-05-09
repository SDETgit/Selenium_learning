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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lombok.With;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

//Do not make xpath based on text because during execution it will change
public class S003_CarLoan {
	@BeforeSuite
	public void WebTest1() {
		System.out.println("WebTest1 Before Suite");
	}

	@AfterSuite
	public void WebTest2() {
		System.out.println("WebTest2 After Suite Suite");
	}

	@BeforeTest
	public void WebTest3() {

		System.out.println("WebTest3 Web3_BeforeTest");

	}

	@AfterTest
	public void WebTest4() {

		System.out.println("WebTest4_AfterTest");

	}
	@Test (timeOut = 4000) //(enabled = false) 
	//(test will wait for 4 seconds if it takes more than it will fail  )
	public void CarLoan11() {

		System.out.println("CarLoan11");

	}
	@Test (enabled = true) //(enabled = false)
	public void CarLoan1() {

		System.out.println("CarLoan1");

	}

	@Test  (dependsOnMethods = {"CarLoan1","login"})
	public void CarLoan2() {

		System.out.println("CarLoan2");

	}
	@Test(groups = {"setup"})
	public void login() {
		System.out.println("SetUp_Login");
	}

	@Test(groups = {"setup"})
	public void loadData() {
		System.out.println("SetUp_loadData");
		
	}

	@Test(dependsOnGroups = {"setup"})
	public void executeTest() {
		
		System.out.println("executeTest_dependsonGroup");
	}
}
