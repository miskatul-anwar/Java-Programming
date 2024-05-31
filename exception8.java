import java.lang.*;
import java.util.Scanner;

class notEqualsException extends Exception {
  notEqualsException(String info) {
    super(info);
  }
}

public class exception8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    try {
      if (n == 0) {
        System.out.println("Done");
      } else {
        notEqualsException exe = new notEqualsException("This is a great issue !");
        throw exe;
      }
    } catch (notEqualsException exe) {
      System.out.println(exe.getMessage());
    }
  }
}
