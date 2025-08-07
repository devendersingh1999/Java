package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Rectangle implements Serializable{
	
	
	int length, breadth, area;
	
	Rectangle(int lenght, int breadth){
		
		this.length = lenght;
		this.breadth = breadth;
		this.area = length * breadth;
		
	}
}

public class SerilizationExample {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file= new FileOutputStream("Rectangle.ser");
	
		ObjectOutputStream obj = new ObjectOutputStream(file);
		
		Rectangle rect = new Rectangle(3,5);
		Rectangle rect1 = new Rectangle(3,10);

		
		obj.writeObject(rect);
		obj.writeObject(rect1);
		System.out.println("Serialization is done");
		
	obj.close();
	}
}
