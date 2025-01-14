import java.util.Scanner;

/**
 * Ans1
 */

class Person {
  private String name;
  private Integer age;

  Person(String name, Integer age) {
    this.name = name;
    this.age = age;
    System.out.println(this.name + " " + this.age);
  }
}

public class Ans1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    Integer age = sc.nextInt();

    Person person = new Person(name, age);
  }

}
