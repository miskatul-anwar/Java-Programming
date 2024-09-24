@FunctionalInterface
interface foo {
  void sum(int x, int y);
}

@FunctionalInterface
interface hello {
  void greet();

  void neglect(String name);
}

public class b {
  public static void main(String[] args) {
    int x = 3, y = 5;
    foo obj1 = (a, b) -> System.out.println(a + b);
    obj1.sum(x, y);
    hello obj2 = () -> System.out.println("Hello");
    name = "me";
    hello obj3 = (name) -> System.out.println(name);
    obj2.greet();
    obj3.neglect();
  }
}
