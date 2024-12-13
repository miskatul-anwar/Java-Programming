class Counter {
  private static int cnt = 0;

  void increment() {
    cnt++;
  }

  public static int getCount() {
    return cnt;
  }
}

public class programLife {

  public static void main(String[] args) {
    new Counter().increment();
    new Counter().increment();
    System.out.println("The current count is: " + Counter.getCount());
  }
}
