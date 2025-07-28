package p1;

public class BikeRunner {
public static void main(String[] args) {
	
	Bike ducati = new Bike();
	ducati.setSpeed(30);
	
	ducati.decrease(50);
	System.out.println(ducati.getSpeed());
	
}
}
