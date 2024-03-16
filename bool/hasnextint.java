import java.util.Scanner;

public class hasnextint {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    boolean b1 = sc.hasNextInt();
    System.out.println(b1);
    return;
  }
}
