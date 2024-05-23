import java.util.*;
import cse.utils.*;
import java.lang.Exception;

public class arrays {
  public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<Integer>(7);
    int itr = 0;
    for (int i : array) {
      array.add(++itr);
    }
    spec.print(array.toString());
    int b = 7;
    try {
      for (int it : array) {
        spec.print(it / (b - 7) + " ");
      }
    } catch (ArithmeticException e) {
      spec.println("Divide by 0");
    } catch (ArrayIndexOutOfBoundsException e) {
      spec.println("Array Index Out of Bound");
    }
    return;
  }
}
