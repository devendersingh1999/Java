package genericsExample;

public class GenericsRunner {
public static void main(String[] args) {
	
	MyCustomeList<String> list = new MyCustomeList<>();
	
	list.addElement("element1");
	list.addElement("element2");
	
			System.out.println(list);
			
			
			MyCustomeList<Integer> list2 = new MyCustomeList<>();

			list2.addElement(5);
			list2.addElement(7);
			list2.addElement(56);
			list2.addElement(3);

			
			System.out.println(list2);
	
			list2.removeElement(56);
System.out.println(list2);
}
}
