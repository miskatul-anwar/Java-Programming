@FunctionalInterface
interface A {
  void show(int i);
}

/**
 * Demo2
 */
public class Demo2 {
  public static void main(String[] args) {
    A obj = new A() {
      public void show(int i) {
        System.out.println(i);
      }
    };
    obj.show(5);
    A lambda = i -> System.out.println(i); // As you know for 1 expression, there's no need for brackets
    lambda.show(5);
    return;
  }
}
