package te;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	CallableTask(String name) {

		this.name = name;

	}

	public String call() throws InterruptedException {

		Thread.sleep(1000);
		return "Hello" + name ;
	}
}

public class InvokeAllCallable {

	public static void main(String[] args) throws InterruptedException {

//		here we create the fixed thread
		ExecutorService task = Executors.newFixedThreadPool(3);

//		here we adding the values 
		List<CallableTask> execute = List.of(new CallableTask("DEV"), new CallableTask("Sagar"),
				                new CallableTask("Akash"), new CallableTask("Rohit"), new CallableTask("Hashit"));

//		the future interface expection some values task.invokeAll() method 
//		                                invoking all the threads which is created in (task)
		
		List<Future<String>> result = task.invokeAll(execute);

		for (Future<String> val : result) {

			System.out.println(val.get());
		}

		task.shutdown();
	}
}