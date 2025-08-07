package tes;

import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SecondHighest {
public static void main(String[] args) {
	
	List<Integer> list = List.of(1,2,2,4,41,4,41,4,7,8,3,5,7,8,9);
	
	Set<Integer> ts = new TreeSet<>(list);
	
	
	
	System.out.println("sorted :"+ts);
	 System.out.println("Descending Order: " + ((TreeSet<Integer>) ts).descendingSet());

	
	Iterator<Integer> desc = ((TreeSet<Integer>)ts).descendingIterator();
	desc.next(); 
	System.out.println("SecondHighest number :"+desc.next());
	


}
}
