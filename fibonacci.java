import java.util.*;
import java.io.*;
import java.math.*;

public class fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt(), fib1 = 0, fib2 = 1, fib = 0;
    sc.close();
    for (int it = 1; it <= size; it++) {
      if (it == 1) {
        System.out.print(fib1 + " " + fib2 + " ");
      }
      fib = fib1 + fib2;
      fib1 = fib2;
      fib2 = fib;
      System.out.print(fib + " ");
    }
  }
}
