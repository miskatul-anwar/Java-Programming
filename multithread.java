import cse.utils.*;
import java.util.*;

class A extends Thread {
  public void run() {
    spec.println("A");
  }
}

class B extends Thread {
  public void run() {
    spec.println("B");
  }
}

public class multithread {
  public static void main(String args[]) {
    // new A().start();
    // new B().start();
    A a = new A();
    B b = new B();
    a.start();
    b.start();
    // a.stop();
    // b.stop();
  }
}
