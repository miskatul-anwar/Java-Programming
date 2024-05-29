import java.util.ArrayList;

public class exception5 {
  public static void main(String[] args) {
    try {
      // ArrayList<Integer> a = new ArrayList<Integer>(3);
      int a[] = { 1, 2, 3 };
      for (int i = 0; i <= 10; i++) {
        System.out.println(a[i]);
      }
      int i = 0;
      i = i / 0;
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Done fixing");
    }
  }
}
