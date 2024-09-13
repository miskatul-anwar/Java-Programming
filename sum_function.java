import java.util.*;

class functions {
  public static int sum(int a, int b) {
    return a + b;
  }

  public static void print(Object obj) {
    System.out.println(obj);
  }

  public static int factorial(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }
}

public class sum_function {
  public static void main(String[] args) {
    functions.print("Enter two numbers :");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    functions.print("Sum of " + a + " and " + b + " is " + functions.sum(a, b));
    return;
  }
}
