import java.util.Scanner;

public class for1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a = sc.nextInt();
    for (int i = 0; i < a; i++) {
      System.out.println(i);
    }
    return;
  }
}
