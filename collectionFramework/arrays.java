import java.util.*;
import cse.utils.*;

public class arrays {
  public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<Integer>();
    int b = 7;
    try {
      for (int it : array) {
        spec.print(it / (b - 7));
      }
    } catch (ArithmeticException e) {
      spec.println("Divide by 0");
    } catch (ArrayIndexOutOfBoundsException e) {
      spec.println("Array Index Out of Bound");
    }
    return;
  }
}
