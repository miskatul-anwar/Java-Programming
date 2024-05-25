import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadedPrint {
  public static void main(String[] args) throws InterruptedException {
    ExecutorService executor = Executors.newFixedThreadPool(2);

    for (int i = 0; i < 50; i++) {
      int finalI = i;
      executor.submit(() -> System.out.println(finalI + 1));
    }

    executor.shutdown();
  }
}
