package tes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramWordsIngGrounp {
public static void main(String[] args) {
	
	List<String> list = List.of("bat", "tab" ,"cat", "act", "dog");
	
	Map<String, List<String>> hm = new HashMap<>();
	
	for(String word : list) {
		char [] ch = word.toCharArray();
		Arrays.sort(ch);
		String sortKey = new String(ch);
		
		hm.computeIfAbsent(sortKey, k -> new ArrayList<>()).add(word);
		
		
	}
	
	for(List<String> a : hm.values()) {
		System.out.println(a);
	}
}
}
