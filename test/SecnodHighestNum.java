package test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SecnodHighestNum {
public static void main(String[] args) {
	
	List<Integer> list = List.of(1,2,2,4,41,4,41,4,7,8,3,5,7,8,9);

	List<Integer> newList = list.stream()
			                    .sorted(Comparator.reverseOrder())
			                    .distinct()
			                    .collect(Collectors.toList());
	
	newList.get(0);
System.out.println(newList);
	System.out.println(	newList.get(1));

//Set<Integer> ls= new TreeSet<>(list);
//
//System.out.println("DESC : "+ ((TreeSet<Integer>)ls).descendingSet());
//
//Iterator<Integer> desc = ((TreeSet<Integer>)ls).descendingIterator();
//
//desc.next();
//System.out.println("secondHighest :"+ desc.next());
}
}