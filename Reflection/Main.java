import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Example {
  private String hiddenField = "Hello, Reflection!";

  private void hiddenMethod() {
    System.out.println("Hidden method invoked!");
  }
}

public class Main {
  public static void main(String[] args) {
    try {
      // Get the Example class
      Class<?> exampleClass = Class.forName("Example");

      // Create an instance of Example
      Object exampleInstance = exampleClass.getDeclaredConstructor().newInstance();

      // Access the hidden field
      Field field = exampleClass.getDeclaredField("hiddenField");
      field.setAccessible(true); // Bypass private access
      System.out.println("Field value: " + field.get(exampleInstance));

      // Access the hidden method
      Method method = exampleClass.getDeclaredMethod("hiddenMethod");
      method.setAccessible(true); // Bypass private access
      method.invoke(exampleInstance);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
