package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramWords {
public static void main(String[] args) {
	
	List<String> list = List.of("bat", "tab" ,"cat", "act", "dog");

	Map<String, List<String>> hmap = new HashMap<>();
	
	for(String word : list) {
		
		char ch[]=word.toCharArray();
		
		Arrays.sort(ch);
		String sort=new String(ch);
		
		hmap.computeIfAbsent(sort, k -> new ArrayList<String>()).add(word);
	}
	
	for(List<String> a : hmap.values()) {
		System.out.println(a);
	}
	
	hmap.values().stream().forEach(System.out::println);
	
}
}
