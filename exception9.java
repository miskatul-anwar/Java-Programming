/**
 * exception9
 */
public class exception9 {
  public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException {
    int a[] = { 1, 2, 3 };
    int b = a[5] / 0;
    System.out.println(b);
    return;
  }
}
