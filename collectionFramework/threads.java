import cse.utils.*;
import java.lang.Thread;

class A extends Thread {
  public void run() {
    for (int i = 0; i < 5; i++) {
      spec.println("Hello from thread A");
    }
    spec.println("Bye from thread A");
  }
}

class B extends Thread {
  public void run() {
    for (int i = 0; i < 5; i++) {
      spec.println("Hello from thread B");
    }
    spec.println("Bye from thread B");
  }
}

class C extends Thread {
  public void run() {
    for (int i = 0; i < 5; i++) {
      spec.println("Hello from thread C");
    }
    spec.println("Bye from thread C");
  }
}

public class threads {
  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();
    a.start();
    b.start();
    c.start();
    return;
  }
}
