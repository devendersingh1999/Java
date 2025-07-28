package p1;

public class Planet {
	
	String name;
	String location;
	int distance;
	
	Planet(String name, String location, int distance){
		
		this.name = name;
		this.location = location;
		this.distance = distance;
		
	}
	void Planetdetails() {
		
		System.out.println(" planet "+ name + " location "+ location + " distance " + distance);
	}
	
	public static void main(String[] args) {
		
		Planet earth = new Planet("earth", "solarsystem", 32);
		earth.Planetdetails();
	}

}
