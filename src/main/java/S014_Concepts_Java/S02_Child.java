package S014_Concepts_Java;

import org.testng.annotations.Test;

public class S02_Child extends S01_Parent{
	
	
	@Test
	public void child(){
		//S01_Parent p = new S01_Parent() ;
		//p.dothis();
		dothis();
		System.out.println("This is child class");
		
		S03_parent2 s = new S03_parent2(3);
		
		System.out.println(s.increment());
		System.out.println(s.decrement());
		
		//S04_parent3 s3 = new S04_parent3(3);
		//System.out.println(s3.multiply());
		System.out.println(s.multiply());
	}
}
