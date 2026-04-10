package S010_Java_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.poi.ss.formula.eval.ConcatEval;
import org.testng.Assert;
import org.testng.annotations.Test;

//Do not make xpath based on text because during execution it will change
public class S002_Java_Streams2 {

	@Test
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
		
		//System.out.println(c);
		//2
		
		//map 
		//al.stream().filter(s->s.contains("x")).map(s->s.toUpperCase()).forEach(s->System.out.print(s+" "));
		//Output		
		//JOLENE FOX MAXTON GILL FRANKLIN SIERRA
		
		//sorted 
		//al.stream().filter(s->s.endsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		/*
		 * output FRANKLIN SIERRA KEILY MEZA MARCELINE AVILA
		 */
		
		List<String> list2 = Arrays.asList("A1","A2","A3","A4","A5","A6");
		
		//Concat two Streams 
		Stream<String> concat_Stream = Stream.concat(al.stream(), list2.stream());
		
		//concat_Stream.sorted().forEach(s->System.out.print(s+" ")); //A1 A2 A3 A4 A5 A6 Amelie Griffith Antonio Crosby Bowen Higgins Franklin Sierra Jolene Fox Keily Meza Leighton Kramer Marceline Avila Maxton Gill Saige Fuentes
		
		//find element in stream 
		
		Boolean flag = concat_Stream.anyMatch(s->s.equalsIgnoreCase("A1"));
		Assert.assertTrue(flag);
		
		
		//making another list out of Streams 
		List<String> ar = 
		Stream.of("Saige","Fuentes","Bowen","Higgins","Leighton","Kramer","Amelie","Griffith","Franklin",
				"Sierra","Marceline","Avila","Jolene","Fox","Antonio","Crosby","Keily","Meza","Maxton","Gill").filter(s->s.endsWith("e"))
		.map(s->s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(ar);
		System.out.println(ar.get(0));
		
		
		
	}
}
