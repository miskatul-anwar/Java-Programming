public class Outer4 {
  public void someMethod() {
    new Inner().someOtherMethod("Hello");
  }

  private class Inner implements OtherClassInterface {
    public void someOtherMethod(String message) {
      System.out.println(message);
    }
  }
}
