public class Outer {
  private int x = 8;

  public class Inner {
    public void printX() {
      System.out.println("x = " + x);
    }
  }

  public static void main(String[] args) {
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();
    inner.printX();
    return;
  }
}
