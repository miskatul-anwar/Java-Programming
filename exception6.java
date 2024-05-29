import java.lang.Exception;
import cse.utils.*;
import java.util.Scanner;

class noMatchException extends Exception {
  noMatchException(String message) {
    super(message);
  }
}

public class exception6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = "Bangladesh";
    String s2 = sc.next();
    sc.close();
    try {
      if (s2.equals(s1)) {
        spec.println("Match");
      }
    } catch (Exception exp) {
      System.out.println(exp.getMessage());
    } finally {
      System.out.println("I love you 💌 ");
    }
    return;
  }
}
