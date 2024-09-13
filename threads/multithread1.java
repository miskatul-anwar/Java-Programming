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
      System.out.println("Gottcha 🤠");
    } finally {
      System.out.println("End of thread A");
    }
  }
}

public class multithread1 {
  public static void main(String[] args) {
    System.out.println("Main Method !");
    A a1 = new A();
    A a2 = new A();
    a1.setPriority(10);
    a2.setPriority(5);
    a1.start();
    a2.start();
    return;
  }
}
