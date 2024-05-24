import cse.utils.*;

class X implements Runnable {
  public void run() {
    for (int i = 0; i < 10; i++) {
      spec.println("Thread " + i);
    }
    spec.println("End of Thread");
  }
}

public class runnableInterface {
  public static void main(String[] args) {
    X runnable = new X();
    Thread threadX = new Thread(runnable);
    threadX.start();
    spec.println("End of Main Thread");
  }
}
