package p1;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	
	BigDecimal principal;
	BigDecimal interest ; 

	public SimpleInterestCalculator(String principal, String interest) {
		// TODO Auto-generated constructor stub
		
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
		
		
	}
	
	public BigDecimal calculateTotalValue(int years) {
		// TODO Auto-generated method stub
		BigDecimal ye = new BigDecimal(years);
		BigDecimal totalValue = principal.add(
				principal.multiply(interest)
				.multiply(ye)
				);
		
		return totalValue;
	}

}
