import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fib {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int lim = sc.nextInt();
    sc.close();
    int fib1 = 0, fib2 = 1, fib = 0;
    System.out.printf("%d %d ", fib1, fib2);
    for (int i = 0; i < lim; i++) {
      fib = fib1 + fib2;
      System.out.printf("%d ", fib);
      fib1 = fib2;
      fib2 = fib;
    }
  }
}
