// Compile time polymorphism, state binding -> Method overloading
public class Overload {
  protected int add(int x, int y) {
    return x + y;
  }

  protected int add(int x, int y, int z) {
    return x + y + z;
  }

  protected void add() {
    System.out.println("Nothing to add!");
  };

  public static void main(String[] args) {
    new Overload().add();
    System.out.println(new Overload().add(1, 3));
    System.out.println(new Overload().add(1, 3, 1));
  }
}
