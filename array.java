import java.util.*;

public class array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    sc.close();
    System.out.println("Array elements are: " + Arrays.toString(a));
  }
}
