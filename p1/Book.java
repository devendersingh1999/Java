package p1;

public class Book {
private String name; 
private String color;
private int price;
 
//this is the setter we can also write the method indivisually
//use the right click go to the source use getter and setter
 
 void setDetails(String name, String color, int price) {
	 
	 this.name =name;
	 this.color= color;
	 this.price = price;
	 
 }


 public String getName() {
	return name;
 }


 public String getColor() {
	return color;
 }


 public int getPrice() {
	return price;
 }

}
