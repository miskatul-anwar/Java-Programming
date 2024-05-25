import cse.utils.*;

class A implements Runnable {
  public void run() {
    spec.println("HI from thread");
  }
}

public class runnable {
  public static void main(String[] args) {
    Thread a = new Thread(new A());
    a.start();
  }
}
