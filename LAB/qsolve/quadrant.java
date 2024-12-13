import java.util.Scanner;

public class quadrant {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt(), y = scanner.nextInt();
    scanner.close();
    if (x > 0 && y > 0) {
      System.out.println("Quadrant I");
    } else if (x < 0 && y > 0) {
      System.out.println("Quadrant II");
    } else if (x < 0 && y < 0) {
      System.out.println("Quadrant III");
    } else if (x > 0 && y < 0) {
      System.out.println("Quadrant IV");
    } else if (x == 0 && y != 0) {
      System.out.println("Point lies on the Y-axis");
    } else if (y == 0 && x != 0) {
      System.out.println("Point lies on the X-axis");
    } else {
      System.out.println("Point is at the origin");
    }
  }
}
