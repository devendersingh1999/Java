package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	FileInputStream file = new FileInputStream("Rectangle.ser");
	
	ObjectInputStream ob=new ObjectInputStream(file);
	
	Rectangle rec = (Rectangle) ob.readObject();
	
	ob.close();
	
	System.out.println("Length : "+ rec.length);
	System.out.println("Breadth : "+ rec.breadth);
	System.out.println("Area :"+ rec.area);
}
}
