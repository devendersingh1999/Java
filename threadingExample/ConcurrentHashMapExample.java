package threadingExample;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentHashMapExample {
public static void main(String[] args) {
	
	
	String str = "ABC SFD GDG ADA ASR MRM MUN RAS";
	
	ConcurrentMap<Character , LongAdder> occurance = new ConcurrentHashMap<>();
	
	for(char character : str.toCharArray()) {
		
		occurance.computeIfAbsent(character, ch ->  new LongAdder()).increment();;
	}
	
	System.out.println(occurance);
}
}
