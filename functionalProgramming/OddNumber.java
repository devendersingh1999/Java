package functionalProgramming;

import java.util.List;

class FilterOddNumber{
	
	public static void Odd(List<Integer> number) {
		
		number.stream().filter(v ->  v % 2 !=0)
		.forEach(a -> System.out.println(a));
		
	}
	
}

public class OddNumber {
public static void main(String[] args) {
	

	List<Integer> num = List.of(1,2,3,4,5,6,7,8,9,10);
	
	FilterOddNumber.Odd(num);
}
}