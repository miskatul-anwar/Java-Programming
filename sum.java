import java.util.Scanner;

/**
 * sum
 */

public class sum {
  public int summation(int x1, int x2) {
    return x1 + x2;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    sc.close();
    System.out.println(new sum().summation(x, y));
    System.out.println(System.out.println(new sum(1, 2)));
  }
}
