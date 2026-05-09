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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lombok.With;

//Do not make xpath based on text because during execution it will change
public class S001_TestNG1 {

	@BeforeClass
	public void WebTest1() {

		System.out.println("Web1_BeforeClass");

	}

	@BeforeMethod
	public void WebTest2() {

		System.out.println("Web2_BeforeMethod");

	}

	@Test (groups = {"Smoke"})
	public void MobTest1() {

		System.out.println("MOb1Smoke");

	}

	@Test(groups = {"Regression"})
	public void APITest() {

		System.out.println("APITestRegression");

	}

}
