package te;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask1 implements Callable<String>{

	private String name;
	CallableTask1(String name){
		
		this.name= name;
	}
	public String call() throws InterruptedException {
		
		Thread.sleep(1000);
		return "HELLO " + name;
		
		
	}
}
public class CallableRunner{
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService task = Executors.newFixedThreadPool(2);
	
		
		Future<String> welcome = task.submit(new CallableTask1("Sagar"));
		
		System.out.println(welcome.get());

		
//		this will not execute to execute this we need to store in variable and use the .get() mehtod
		
		
//		task.submit(new CallableTask1("User1"));
//		task.submit(new CallableTask1("User2"));
//		task.submit(new CallableTask1("User3"));

		 
		task.shutdown();
	}
}


