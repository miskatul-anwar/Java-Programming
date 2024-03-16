import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    System.out.println("Enter two Numbers:");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = a + b;
    System.out.println("Sum of two numbers is: " + c);
    return;
  }
}
