package ExceptionExample;

class InvalidAge extends Exception{
	
	public InvalidAge(String msg) {
		
		super(msg);
	}
	
}

public class Agee {

	public static void checkAge(int age) throws InvalidAge {
		
		if(age < 18 ) {
			
			throw new InvalidAge("Age is not valid");
		}
		else {
			System.out.println("valid age");
		}
	}
	
public static void main(String[] args) {
	
	try {
		
		checkAge(18);
	}
	catch(InvalidAge e){
		
		System.out.println(e.getMessage());
	}
}
}
