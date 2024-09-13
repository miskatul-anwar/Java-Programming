import cse.utils.*;

class MyRunnable implements Runnable {
  public void run() {
    spec.print("Hi");
  }
}

public class Main2 {
  public static void main(String[] args) {
    Thread myThread = new Thread(new MyRunnable());
    myThread.start();
  }
}
