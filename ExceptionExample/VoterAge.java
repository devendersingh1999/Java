package ExceptionExample;

class InvalidAgeException extends Exception {
	

	public InvalidAgeException (String msg) {
		
		super(msg);
	}
}

public class VoterAge {
	
	public static void checkAge(int age) throws InvalidAgeException {
		
		if(age < 18 ) {
			throw new InvalidAgeException("Age must be 18 or above 18");
			
		}
		else {
			System.out.println("person is eligible for vote");
		}
	}
public static void main(String[] args) throws InvalidAgeException {
	
	checkAge(18);
}
}
