import java.util.*;
import cse.utils.*;

class A extends Thread {
  public void run() {
    spec.println("A Thread");
  }
}

class B extends Thread {
  public void run() {
    spec.println("B Thread");
  }
}

class C extends Thread {
  public void run() {
    spec.println("C Thread");
  }
}

public class priority_thread extends Thread {
  public static void main(String args[]) {
    A a = new A();
    B b = new B();
    C c = new C();
    priority_thread pro = new priority_thread();
    a.setPriority(10);
    b.setPriority(5);
    c.setPriority(2);
    pro.setPriority(1);
    a.start();
    b.start();
    c.start();
    pro.start();
  }

  @Override
  public void run() {
    spec.println("Main Thread");
  }
}
