import cse.utils.*;
import java.util.*;

class X implements Runnable {
  public void run() {
    spec.println("HI from X");
  }
}

public class runnabletheads {
  public static void main(String[] args) {
    // X runnable = new X();
    Thread threadX = new Thread(new X());
    threadX.start();
  }
}
