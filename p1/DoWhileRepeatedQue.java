package p1;

import java.util.Scanner;

public class DoWhileRepeatedQue {
public static void main(String[] args) {

	 Scanner s=new Scanner(System.in);
	 int number =-1;
	do {
		if(number != -1) {
		System.out.println("cube is "+ (number * number * number) );
		}
		System.out.println("ENter Number : ");
		
		 number = s.nextInt();
	}
	while(number >= 0); 
		System.out.println("have f un");
		
	
}
}
