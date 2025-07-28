package p1;

import java.util.Scanner;

public class Calculation {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	
	int num = s.nextInt();
	
	if(num == 1) {
		
		int num1, num2;
		
		System.out.println("enter number");
		
		num1 = s.nextInt();
		num2 = s.nextInt();
		
		System.out.println("the adding of num1 and num2 = "+ (num1 + num2));
		
	}
	
if(num == 2) {
		
		int num1, num2;
		
		System.out.println("enter number");
		
		num1 = s.nextInt();
		num2 = s.nextInt();
		
		System.out.println("the adding of num1 and num2 "+ (num1 - num2));
		
	}

if(num == 3) {
	
	int num1, num2;
	
	System.out.println("enter number");
	
	num1 = s.nextInt();
	num2 = s.nextInt();
	
	System.out.println("the adding of num1 and num2 "+ (num1 / num2));
	
}

if(num == 4) {
	
	int num1, num2;
	
	System.out.println("enter number");
	
	num1 = s.nextInt();
	num2 = s.nextInt();
	
	System.out.println("the adding of num1 and num2 "+ (num1 * num2));
	
}




}
}
