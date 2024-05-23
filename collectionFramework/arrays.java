import java.util.*;
import cse.utils.*;
// import java.lang.Exception;

public class arrays {
  public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<Integer>(7);
    int itr = 0;
    for (int i : array) {
      array.add(++itr);
    }
    spec.print(array.toString());
    int b = 7;
    // if (b < 7) {
    // throw new ArithmeticException();
    // }
    try {
      for (int it : array) {
        spec.print(it / (b - 7) + " ");
      }
    } catch (ArithmeticException | ArrayIndexOutOfBoundsException | ArrayStoreException e) {
      spec.println("Divide by 0");
    } finally {
      spec.println("In Finally");
    }
    return;
  }
}
