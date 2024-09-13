public class fibonacci {
  public static void main(String[] args) {
    System.out.print("Enter a number to print fibonacci: ");
    int fib = 0, fib1 = 0, fib2 = 1;
    for (int i = 0; i < 6; i++) {
      System.out.println(fib);
      fib = fib1 + fib2;
      fib1 = fib2;
      fib2 = fib;
    }
    return;
  }
}
