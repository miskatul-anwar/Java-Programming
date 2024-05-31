public class exception7 {
  public static void main(String args[]) {
    try {
      int a[] = { 1, 2, 3 };
      int b = 42 / 0;
      System.out.println(b);
      System.out.println("a = " + a);
      try {
        int x = a[4];
        System.out.println(x);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array index out-of-bounds: " + e);
      }
    } catch (ArithmeticException e) {
      System.out.println("Divide by 0: " + e.getMessage());
    }
  }
}
