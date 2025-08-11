package test;

class OddEven {

	boolean isOdd = true;
	int n;
	
	OddEven(int num){
		this.n=num;
	}

	synchronized void odd() throws InterruptedException {

		for (int i = 1; i <= n; i += 2) {

			if (!isOdd) {
				wait();
			}
			System.out.println("Odd Number : " + i);
			Thread.sleep(1000);
			isOdd = false;
			notify();
		}

	}

	synchronized void even() throws InterruptedException {

		for (int i = 2; i <= n; i += 2) {

			if (isOdd) {
				wait();
			}
			System.out.println("Even Number : " + i);
			Thread.sleep(1000);
			isOdd = true;
			notify();
		}

	}
}

public class OddEvenPrint {
public static void main(String[] args) {
	
	OddEven call = new OddEven(10);
	
	Thread t1 = new Thread(() -> {
		try {
			call.odd();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	});
	
	Thread t2=new Thread(() -> {
	try {
		call.even();
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}});
	t1.start();
	t2.start();
}
}
