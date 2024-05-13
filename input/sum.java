import java.util.Scanner;

public class sum {
  public static int main(String[] args) {
    System.out.println("Enter two numbers: ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = a + b;
    System.out.println("Sum of two numbers is: " + c);
    return 0;
  }
}
