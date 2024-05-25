import java.lang.*;

public class multiple_exception {
  public static void main(String[] args) {
    int b[] = { 1, 2, 3 };
    try {
      for (int i = 0; i <= 4; i++) {
        System.out.println(b[i]);
        System.out.println(b[i] / 0);
      }
    } catch (ArrayIndexOutOfBoundsException exp) {
      System.out.println(exp);
    } finally {
      System.out.println("hi");
      System.out.printf("hello from the exception?\n");
    }
  }
}
