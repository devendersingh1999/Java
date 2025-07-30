package threadingExample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter{

	 private int i = 0;
	 private int j = 0; 
	 
	 Lock lockForI =  new ReentrantLock();
	 Lock lockForJ =  new ReentrantLock();
	 
	 public void incrementI() {
		 lockForI.lock();
		 i++;
		 lockForI.unlock();
	 }
	 
	 public void incrementJ() {
		 
		 lockForJ.lock();
		 j++;
		 lockForJ.unlock();
	 }
	 
	 
	 public int getI() {
		 return i;
	 }
	 
	 
	 public int getJ() {
			return j;
		}
	 
}

public class BiCounterWithLock{
public static void main(String[] args) throws InterruptedException {
	
	Counter count = new Counter();
	
	Runnable t1 = () -> count.incrementI();
	
	Runnable t2 = () -> {
		count.incrementJ();
	};
	
	
	Thread task1 = new Thread(t1);
	Thread task2 = new Thread(t2);
	
	task1.start();
	task2.start();
	
	task1.join();
	task2.join();
	
	System.out.println("I value " + count.getI());
	System.out.println("J value " + count.getJ());

	
	
}
}




















