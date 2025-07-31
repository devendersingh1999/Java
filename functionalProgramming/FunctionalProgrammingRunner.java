package functionalProgramming;

import java.util.List;


public class FunctionalProgrammingRunner {

	private static void printFP(List<String> list , List<Integer> num) {
		
//		this is noraml printing
		list.stream().forEach(element -> System.out.println("fruits : " +element));			
	
		
//		this is reference method double colon
//		this will automatically understand no need to write element
		num.stream().forEach(System.out::println);
	
}
	
	public static void main(String[] args) {
		
		
		List<String> list = List.of("apple" , "banana", "guvava", "pupaya" , "jamun", "graps");
		
		List<Integer> num = List.of(1,4,5,6,7,3,4,8,9,7,2);

		printFP(list, num);
	}
	              
}
