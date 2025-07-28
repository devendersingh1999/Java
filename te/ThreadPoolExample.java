package te;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadExample implements Runnable {

	public void run() {

		System.out.println(Thread.currentThread().getName() + " is executed");

	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

public class ThreadPoolExample {
	public static void main(String[] args) {

		ExecutorService pool = Executors.newFixedThreadPool(2);

for(int i=1; i<=5; i++) {
	
	pool.execute(new ThreadExample());
}
	}
}
