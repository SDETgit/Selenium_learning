package S002_Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class S002_Importance_of_assertions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");

		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement ff = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		ff.click();
		
		
		Assert.assertTrue(ff.isEnabled());
		
		Assert.assertFalse(!ff.isEnabled());
		System.out.println(ff.isEnabled());
		System.out.println(ff.isSelected());
		
		System.out.println(ff.isDisplayed());
		
		
		Assert.assertEquals("a", "a");
		int actual = 1;
		int axpected = 2;
		
		
		
		
		int a = driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size();
		
		System.out.println(a);
		
		Assert.assertEquals(actual, axpected);
		
		
		 // =========================
        // 🔹 HARD ASSERTIONS
        // =========================

        // 1. assertEquals
        Assert.assertEquals("a", "a");

        int actual1 = 1;
        int expected = 1;
        Assert.assertEquals(actual1, expected);

        // 2. assertNotEquals
        Assert.assertNotEquals(1, 2);

        // 3. assertTrue
        Assert.assertTrue(driver.getTitle().contains("Practice"));

        // 4. assertFalse
        Assert.assertFalse(driver.getTitle().contains("WrongText"));

        // 5. assertNull
        String str = null;
        Assert.assertNull(str);

        // 6. assertNotNull
        String str2 = "Selenium";
        Assert.assertNotNull(str2);

        // 7. Checkbox count example (your style)
        int checkboxCount = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
        System.out.println("Checkbox count: " + checkboxCount);

        Assert.assertTrue(checkboxCount > 0);
        Assert.assertEquals(checkboxCount, 3); // update if page changes

        // =========================
        // 🔹 ELEMENT ASSERTIONS
        // =========================

        WebElement radioButton = driver.findElement(By.cssSelector("input[value='radio1']"));

        // isDisplayed
        Assert.assertTrue(radioButton.isDisplayed());

        // isEnabled
        Assert.assertTrue(radioButton.isEnabled());

        // Click and check selected
        radioButton.click();
        Assert.assertTrue(radioButton.isSelected());

        // =========================
        // 🔹 STRING ASSERTIONS
        // =========================

        String title = driver.getTitle();
        Assert.assertEquals(title, "Practice Page");
        Assert.assertTrue(title.startsWith("Practice"));
        Assert.assertTrue(title.endsWith("Page"));
        Assert.assertTrue(title.contains("Practice"));

        // =========================
        // 🔹 LIST ASSERTION
        // =========================

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        Assert.assertEquals(checkboxes.size(), 3);

        // =========================
        // 🔹 SOFT ASSERTIONS
        // =========================

        SoftAssert soft = new SoftAssert();

        soft.assertEquals(1, 2); // will fail but continue
        soft.assertTrue(false);
        soft.assertEquals("Hello", "Hello");

        System.out.println("Soft assertions executed");

        // IMPORTANT: Without this, soft assertions won’t fail test
        soft.assertAll();
	}

}
