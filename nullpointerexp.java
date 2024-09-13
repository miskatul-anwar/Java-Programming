class ExampleClass {
  public void printMessage() {
    System.out.println("Hello, World!");
  }
}

public class nullpointerexp {
  public static void main(String[] args) {
    ExampleClass example = null;

    try {
      // Attempt to call a method on the null object
      example.printMessage();
    } catch (NullPointerException e) {
      System.err.println("Caught NullPointerException: " + e.getMessage());
    }
  }
}
