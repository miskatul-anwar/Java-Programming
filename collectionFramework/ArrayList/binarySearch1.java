import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * binarySearch1
 */

public class binarySearch1 {
  public static void main(String[] args) {
    ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 1, 9, 8, 7, 2));
    Collections.sort(num);
    int target = 7;
    System.out.println("The target 7 found at index: " + Collections.binarySearch(num, target));
    System.out.println("Max : " + Collections.min(num));
    System.out.println("Min : " + Collections.max(num));
    Collections.sort(num, Comparator.reverseOrder());
    return;
  }
}
