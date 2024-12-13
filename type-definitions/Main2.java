class Animal {
  protected String name = "Animal";

  Animal(String name) {
    this.name = name;
  }
}

class Dog extends Animal {
  Dog(String name) {
    super(name);
    System.err.println("Hi, this is " + super.name);
  }
}

public class Main2 {
  public static void main(String[] args) {
    Dog dog = new Dog("Tommy");
    System.err.println(dog.hashCode());
  }
}
