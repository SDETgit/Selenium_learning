package S014_Concepts_Java;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class S01_Parent {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am running before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am running After method");
	}
	
	public void dothis() {
		System.out.println("I am doing this parent class");
	}
}
