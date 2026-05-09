package S015_Notes;

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
public class S001_Streams_list_compare {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().setPosition(new Point(50,190));
		driver.manage().window().setSize(new Dimension(104, 19));
		
		// This is applied globally to all instances of driver
		// it will wait for 5 seconds atleasr before thowing the error

		
	List<WebElement> links = 	driver.findElements(By.tagName("a"));

	for(WebElement a : links)
	{
		if(a.getText().equalsIgnoreCase("Money"))
		{
			a.getCssValue("color");
			System.out.println(a.getCssValue("color")+" location "+a.getLocation()+" size "+a.getSize()+" React "+a.getRect());
			a.click();
			
		break;}
		//System.out.println(a.getAttribute("href"));
	}
	System.out.println(links.size());
	
	//rgba(87, 87, 87, 1)
	//407
	}
	
}
