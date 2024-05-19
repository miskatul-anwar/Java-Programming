import java.util.*;

class Pu {
  public static void print(Object obj) {
    System.out.println(obj);
  }
}

public class print {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Pu.print("Enter a number to create an array: ");
    int x = sc.nextInt();
    int[] a = new int[x];
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    sc.close();
    Pu.print(Arrays.toString(a));
    return;
  }
}
