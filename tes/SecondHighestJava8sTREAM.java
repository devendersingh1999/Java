package tes;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondHighestJava8sTREAM {
public static void main(String[] args) {
	
	List<Integer> list = List.of(1,2,2,4,41,4,41,4,7,8,3,5,7,8,9);

	Set<Integer> ts = new TreeSet<>((a,b) -> b-a);
	
	ts.addAll(list); 
	
	System.out.println("descending : " +ts);
	
	Integer secondHighest = ts.stream().skip(1)
			                  .findFirst()
			                  .orElse(null);
	
	if(secondHighest != null) {
		
		System.out.println("Second Highest : " + secondHighest);
	}
	else {
		System.out.println("not enough elements");
	}
}
}
