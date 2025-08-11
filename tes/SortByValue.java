package tes;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByValue {
public static void main(String[] args) {
	
	Map<Integer, Integer> map=new  HashMap<>(Map.of(2, 10 , 3,30 , 1,40));
	
System.out.println(map);
	List<Integer> result = map.entrySet().stream().map(v -> v.getValue()).collect(Collectors.toList());
	Collections.sort(result);
	
	System.out.println(result);
}
}
                                                                                                                            