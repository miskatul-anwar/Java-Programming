import java.util.Scanner;

public class cgpa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of courses: ");
    int numCourses = sc.nextInt();
    if (numCourses != 0) {
      System.out.println("Enter marks of each course: ");
      System.out.println("CSE111: ");
      float a = sc.nextFloat();
      System.out.println("CSE112: ");
      float b = sc.nextFloat();
      System.out.println("CSE113: ");
      float c = sc.nextFloat();
      float cgpa = (a + b + c) / 3;
      System.out.println("Your CGPA is: " + cgpa);
      return;
    } else {
      System.out.println("You have not registered any course");
      return;
    }
  }
}
