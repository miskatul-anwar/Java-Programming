import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class question6a {
  public static void main(String[] args) throws InterruptedException,
      ExecutionException {
    ExecutorService executor = Executors.newFixedThreadPool(5);

    // Divide the work among 5 threads
    Callable<Integer> task = () -> {
      int start = 20000;
      int end = 200000;
      int sum = 0;

      for (int i = start; i < end; i++) {
        sum += i;
      }

      return sum;
    };

    Future<Integer>[] futures = new Future[5];

    for (int i = 0; i < 5; i++) {
      int start = i * 20000 + 1;
      int end = (i + 1) * 20000;

      // Assign the task to each thread
      futures[i] = executor.submit(task);
    }

    // Get the results from all threads
    int totalSum = 0;
    for (int i = 0; i < 5; i++) {
      totalSum += futures[i].get();
    }

    System.out.println("The sum of numbers from 1 to 100000 is: " +
        totalSum);

    // Shut down the executor service
    executor.shutdown();
  }
}
