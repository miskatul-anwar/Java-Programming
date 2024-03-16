import java.util.Scanner;

public class while1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a = scanner.nextInt();
    int i = 0;
    while (i < a) {
      System.out.println(i);
      i++;
    }
    return;
  }
}
