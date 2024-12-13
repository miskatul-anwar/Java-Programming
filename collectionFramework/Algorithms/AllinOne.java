import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AllinOne {
  public static void main(String[] args) {
    List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Collections.sort(li);
    for (Integer integer : li) {
      System.out.print(integer + " ");
    }
    int index = Collections.binarySearch(li, 2);
    System.out.println(index);
  }
}
