import java.util.Scanner;

/**
 * question 01
 */

class Circle {
  double radius;

  Circle(double r) {
    radius = r;
  }

  double area() {
    return 3.14 * radius * radius;
  }
}

public class q1 {
  public static void main(String[] args) {
    Circle cr = new Circle(new Scanner(System.in).nextInt());
    System.out.println(cr.area());
    return;
  }
}
