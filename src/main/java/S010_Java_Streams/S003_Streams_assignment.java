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
public class S003_Streams_assignment {

	@Test
	public void arrayList() {

		List<Integer> as = Arrays.asList(3,2,2,7,5,1,9,7);
		
		List<Integer> as1 =as.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(as+" "+as1);
		System.out.println(as1.get(2));
		
		//[3, 2, 2, 7, 5, 1, 9, 7] [1, 2, 3, 5, 7, 9]
		//3
	}

	
}
