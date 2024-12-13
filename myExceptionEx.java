import java.lang.Exception;
import java.util.Scanner;

class NegativeException extends Exception {
  NegativeException() {
    super("Negative number!");
  }
}

public class myExceptionEx {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    sc.close();
    if (x < 0) {
      try {
        throw new NegativeException();
      } catch (NegativeException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
