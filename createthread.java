import java.lang.*;
import java.util.*;
import cse.utils.*;

class A implements Runnable {
  String name;
  Thread t;

  A(String threadName) {
    name = threadName;
    t = new Thread(this, name);
    t.start();
  }

  public void run() {
    System.out.println("Running " + name);
  }
}

public class createthread {
  public static void main(String[] args) {
    new A("Thread 1");
    new A("Thread 2");
    new A("Thread 3");
    new A("Thread 4");
    new A("Thread 5");
    new A("Thread 6");
    return;
  }
}
