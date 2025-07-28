package p1;

public class Bike {
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed > 0 ) {
			
		this.speed = speed;
	}
	}
	
	public void increase(int howMuch) {
		
		this.speed += howMuch;
	}
	
	public void decrease(int howMuch) {
		
		setSpeed(this.speed -= howMuch);
		
	}

}
