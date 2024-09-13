// package InnerClass;

public class Outer5 {
  public static Object createObject(String type) {
    if (type.equals("A")) {
      return new A();
    } else if (type.equals("B")) {
      return new B();
    }
    return null;
  }

  private class A implements SomeInterface {
    // implementation
  }

  private class B implements SomeInterface {
    // implementation
  }
}
