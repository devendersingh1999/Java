package p1;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculatorRunner {
public static void main(String[] args) {
	
	SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
	
	BigDecimal totalValue = calculator.calculateTotalValue(5);
	Scanner s=new Scanner(System.in);
	
	System.out.println(totalValue);
}
}
