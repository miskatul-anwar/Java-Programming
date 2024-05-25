import cse.utils.*;

class B {
  void show() {
    spec.println("CLASS A");
  }
}

class A extends B implements Runnable { // Step 1
  public void run() { // Step 2
    for (int i = 1; i <= 10; i++) {
      spec.println("\tThreadX:" + i);
    }
    super.show();
    spec.println("End of ThreadX");
  }
}

public class runnable2 {
  public static void main(String[] args) {
    A runnable = new A();

    Thread threadX = new Thread(runnable); // Step 3
    threadX.start(); // step 4
    spec.println("End of main Thread");
  }
}
