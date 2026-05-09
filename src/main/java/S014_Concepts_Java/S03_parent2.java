package S014_Concepts_Java;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class S03_parent2 extends S04_parent3 {
	
	int a; 
	
	public S03_parent2(int a ) {
		super(a);
		this.a=a;
	}
	
	
	public int increment() {
		a=a+1;
		return a;
	}
	
	public int decrement() {
		a=a-1;
		
		return a;
	}
	
	
	
}
