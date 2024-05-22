import java.util.*;
import cse.utils.*;

public class arrays {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    int array[] = { 5, 8, 7, 4, 9 };
    for (int it : array) {
      list.add(it);
    }
    list.sort(null);
    spec.println(list);
    return;
  }
}
