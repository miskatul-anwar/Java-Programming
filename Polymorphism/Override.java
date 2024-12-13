// Compile time polymorphism, Dynamic binding -> Method overriding

class Person {
  protected String name;

  Person(String name) {
    this.name = name;
  }
}

class Teacher extends Person {
  Teacher(String name) {
    super(name);
    System.out.println(super.name + " is a teacher!");
  }
}

public class Override {

  public static void main(String[] args) {
    new Teacher("Joseph");
  }
}
