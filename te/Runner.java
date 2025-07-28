package te;

import java.util.List;
import java.util.concurrent.*;


//THIS IS ADDING Generics
// ✅ Define generic class with <T>
class CallableTest<T> implements Callable<T> {

    private T value;

    public CallableTest(T value) {
        this.value = value;
    }

    @Override
    public T call() throws InterruptedException {
        Thread.sleep(1000);
        return value;  // return the generic value
    }
}

public class Runner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        // ✅ Use CallableTest<String> and build a list of Callable<String>
        List<Callable<String>> tasks = List.of(
            new CallableTest<>("Sagar"),
            new CallableTest<>("Dev"),
            new CallableTest<>("Aka")
        );

        List<Callable<Integer>> tas = List.of(
                new CallableTest<>(23),
                new CallableTest<>(34),
                new CallableTest<>(23)
                );
        // ✅ Use Future<String> to get results
        List<Future<String>> results = executor.invokeAll(tasks);

        for (Future<String> future : results) {
            System.out.println(future.get());
        }
        
        List<Future<Integer>> result = executor.invokeAll(tas);

        for (Future<Integer> future : result) {
            System.out.println(future.get());
        }

        executor.shutdown();
    }
}
