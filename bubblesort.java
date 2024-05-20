import java.util.*;

class pr {
  public static void print(Object obj) {
    System.out.println(obj);
  }
}

public class bubblesort {
  public static void main(String[] args) {
    int ar[] = { 3, 4, 1, 6, 7, 3, 2, 9 };
    for (int i = 0; i < ar.length; i++) {
      for (int j = 0; j < ar.length - 1; j++) {
        if (ar[j] > ar[j + 1]) {
          int temp = ar[j];
          ar[j] = ar[j + 1];
          ar[j + 1] = temp;
        }
      }
    }
    pr.print(Arrays.toString(ar));
    return;
  }
}
