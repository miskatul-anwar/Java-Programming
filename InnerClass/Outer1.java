public class Outer1 {
  private int value;

  public void setValue(int value) {
    this.value = value;
  }

  private class Inner {
    public void printValue() {
      System.out.println(Outer.this.value);
    }
  }
}
