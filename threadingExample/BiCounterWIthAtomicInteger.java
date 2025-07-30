package threadingExample;

import java.util.concurrent.atomic.AtomicInteger;

class CounterAtomicInteger{
	
	private AtomicInteger i= new AtomicInteger(0);
	private AtomicInteger j= new AtomicInteger(0);
	
	public void incrementI() {
		i.incrementAndGet();
	}
	public int  getI() {
		return i.get();
	}
	
	public void incrementJ() {
		j.incrementAndGet();
	}
	public int getJ() {
		return j.get();
	}
	
}

public class BiCounterWIthAtomicInteger {
public static void main(String[] args) throws InterruptedException {
	
	CounterAtomicInteger count=new CounterAtomicInteger();
	
	Runnable t1 = () -> count.incrementI();
	
	Runnable t2 = () -> count.incrementJ();
	
	Thread task1 = new Thread(t1);
	
	Thread task2 = new Thread(t2);
	
	
	task1.start();
	task2.start();
	
	task1.join();
	task2.join();
	
	System.out.println("i value " + count.getI());
	System.out.println("j value " + count.getJ());

}
}
