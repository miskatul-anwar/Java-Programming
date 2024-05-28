import cse.utils.*;
import java.lang.*;

class A extends Thread {
  @Override
  public void run() {
    for (int j = 1; j <= 10; j++) {
      System.out.println(j);
    }
    try {
      Thread.sleep(100);
    } catch (InterruptedException exception) {
    } finally {
      System.out.println("End of thread A");
    }
  }
}
