package S010_Java_Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

//Do not make xpath based on text because during execution it will change
public class S001_Java_Streams {

	//@Test
	public void arrayList() {

		ArrayList<String> al = new ArrayList();

		al.add("Saige Fuentes");
		al.add("Bowen Higgins");
		al.add("Leighton Kramer");
		al.add("Amelie Griffith");
		al.add("Franklin Sierra");
		al.add("Marceline Avila");
		al.add("Jolene Fox");
		al.add("Antonio Crosby");
		al.add("Keily Meza");
		al.add("Maxton Gill");

		System.out.println(al);
		int count = 0;
		for (String a : al) {
			if (a.startsWith("A")) {
				count++;
			}
		}

		System.out.println(count);
	}

	@Test
	public void streams() {
		ArrayList<String> al = new ArrayList();

		al.add("Saige Fuentes");
		al.add("Bowen Higgins");
		al.add("Leighton Kramer");
		al.add("Amelie Griffith");
		al.add("Franklin Sierra");
		al.add("Marceline Avila");
		al.add("Jolene Fox");
		al.add("Antonio Crosby");
		al.add("Keily Meza");
		al.add("Maxton Gill");
		
		//get count of records with condition 
		Long c = 
		al.stream().filter(s->s.startsWith("A")).count();
		
		System.out.println(c);
		
		//get print all records 
		
//		Stream.of("Saige","Fuentes","Bowen","Higgins","Leighton","Kramer","Amelie","Griffith","Franklin",
//				"Sierra","Marceline","Avila","Jolene","Fox","Antonio","Crosby","Keily","Meza","Maxton","Gill")
//		.filter(s->s.startsWith("A")).forEach(s->System.out.println(s));
//		
		
		//Condition of return flase 
		Stream.of("Saige","Fuentes","Bowen","Higgins","Leighton","Kramer","Amelie","Griffith","Franklin",
				"Sierra","Marceline","Avila","Jolene","Fox","Antonio","Crosby","Keily","Meza","Maxton","Gill")
		.filter(s->
		
		{s.startsWith("A"); return false;}).forEach(s->System.out.println(s));  //returns nothing as condition is return false 
		
		//Count of records 
		Long d = Stream.of("Saige","Fuentes","Bowen","Higgins","Leighton","Kramer","Amelie","Griffith","Franklin",
				"Sierra","Marceline","Avila","Jolene","Fox","Antonio","Crosby","Keily","Meza","Maxton","Gill")
		.filter(s->s.startsWith("A")).count();
		
		System.out.println(" Count "+d);
		
		//again moving to the original stream 
		
		//al.stream().filter(s->s.length()>7).forEach(s->System.out.println(s));
		
		//Limiting the results 
		
		al.stream().filter(s->s.length()>7).limit(2).forEach(s->System.out.println(s));;
		//Saige Fuentes
		//Bowen Higgins
		
		
	}
}
