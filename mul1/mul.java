import java.util.Scanner;

public class mul {
  public static void main(String[] args) {
    System.out.println("Enter two numbers: ");
    Scanner sc = new Scanner(System.in);
    System.out.println("a = ");
    int a = sc.nextInt();
    System.out.println("b = ");
    int b = sc.nextInt();
    System.out.println(a + " x " + b + " = " + a * b);
  }
}
