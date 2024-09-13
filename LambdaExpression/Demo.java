@FunctionalInterface
interface A {
  void show();
}

/**
 * Demo
 */
public class Demo {
  public static void main(String[] args) {
    A obj = new A() {
      public void show() {
        System.out.println("in show");
      }
    };
    obj.show();
    A lambda = () -> System.err.println("in lambda"); // As you know for 1 expression, there's no need for brackets
    lambda.show();
    return;
  }
}
