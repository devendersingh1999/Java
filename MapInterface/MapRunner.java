package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		
		
		String str = "This is an awesome occasion."
				+ " This has never happened before.";
		
		
		Map<Character, Integer> occurance = new HashMap<>();
		
		char [] characters = str.toCharArray();
		
		for(char character : characters) {
			
//			here we collecting key
			Integer integer = occurance.get(character);
			
		
			if(integer == null ) {
				//storing the 1 if the value is null in occurance object
				occurance.put(character , 1);
			
			}
			else {
				
				occurance.put(character, integer + 1);
			}
		
		}
		
		System.out.println(occurance);
		
		
Map<String, Integer> stringOccurance = new HashMap<>();
		
		String [] words = str.split(" ");
		
		for(String word : words) {
			
//			here we collecting key
			Integer integer = stringOccurance.get(word);
			
		
			if(integer == null ) {
				//storing the 1 if the value is null in occurance object
				stringOccurance.put(word , 1);
			
			}
			else {
				
				stringOccurance.put(word, integer + 1);
			}
		
		}
		
		System.out.println(stringOccurance);
	}
}
