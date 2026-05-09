package S014_Concepts_Java;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class S04_parent3 {
	
	int a; 
	
	public S04_parent3(int a ) {
		this.a=a;
	}
	
	
	public int multiply() {
		a=a*2;
		return a;
	}
	
	public int decrement() {
		a=a-1;
		
		return a;
	}
	
	
	
}
