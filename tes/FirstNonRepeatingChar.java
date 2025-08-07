package tes;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
public static void main(String[] args) {
	
	String word="swiss";
	
	Map<Character, Integer> hm= new HashMap<>();
	
	for(char c : word.toCharArray()) {
		
		hm.put(c, hm.getOrDefault(c, 0) + 1);
	
}
	
	for(char c : word.toCharArray()) {
		
		if(hm.get(c) == 1) {
			System.out.println("first non repeating character is "+ c);
			return;
		}
		
	}
}
}
