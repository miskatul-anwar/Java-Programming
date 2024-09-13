import java.lang.Exception;
import cse.utils.*;

public class execption2 {
  public static void main(String[] args) {
    int a[] = { 2, 3, 4, 5, 6 };
    try {
      for (int i = 1; i < 10; i++) {
        spec.print(a[i]);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      spec.println("Array index out of bounds");
    } finally {
      spec.println("Exception handled");
    }
  }
}
