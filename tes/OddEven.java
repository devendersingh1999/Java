package tes;

 class OddEvenExample {

	boolean isOdd=true; 
	 
	synchronized void odd() throws InterruptedException {

		for (int i = 1; i <= 10; i+=2 ) {
			while(!isOdd) {
				wait();
			}
				System.out.println("odd :" + i);
				isOdd=false;
				notify();
			}
		}

	synchronized void even() throws InterruptedException {

		for (int i = 2; i <= 10; i+=2) {
			while(isOdd) {
				wait();
			}
				System.out.println("even :" + i);
				isOdd=true;
				notify();
			}
		}
 }

public class OddEven{
public static void main(String[] args) {
	
	OddEvenExample p= new OddEvenExample();
	

	Thread odd= new Thread(() -> {
		try {
			p.odd();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	});
	Thread even= new Thread(() -> {
		try {
			p.even();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	});

	odd.start();
	even.start();
}
}

	
