import java.util.*;

class Pu {
  public static void println(Object obj) {
    System.out.println(obj);
  }

  public static void print(Object obj) {
    System.out.print(obj);
  }

}

class series {
  public static void fibonacci(int n) {
    int fib1 = 0, fib2 = 1, fib = 0;
    for (int i = 1; i <= n; i++) {
      if (i == 1) {
        Pu.print(fib1 + " " + fib2 + " ");
      }
      fib = fib1 + fib2;
      fib1 = fib2;
      fib2 = fib;
      Pu.print(fib + " ");
    }
  }
}

public class calculator {
  public static void main(String[] args) {
    Pu.print("Enter size of fibonacci sequence :");
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    scanner.close();
    series.fibonacci(size);
  }
}
