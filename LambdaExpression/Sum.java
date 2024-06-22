@FunctionalInterface
interface InnerSum {
  void sum(int x, int y);
}

public class Sum {
  public static void main(String[] args) {
    int x = 6, y = 6;
    InnerSum obj2 = new InnerSum() {
      public void sum(int x, int y) {
        System.out.println(x + y);
      }
    };
    // Lambda expression
    InnerSum obj = (a, b) -> System.err.println(a + b);

    // Calling the lambda
    obj.sum(x, y);
  }
}
