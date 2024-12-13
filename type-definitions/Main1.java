class Number {
  private int number = 0;

  Number(int val) {
    this.number = val;
    System.err.println("Number Initialized!\nValue = " + number);
  }
}

interface Animal {

  void makeSound();

  default public void eat() {
    System.out.println("Animal is eating");
  }
}

class Dog implements Animal {
  private String name = "";

  Dog(String name) {
    this.name = name;
  }

  @Override
  public void makeSound() {
    System.out.println(this.name + " Barks");
  }

  @Override
  public void eat() {
    System.out.println(this.name + " is eating!");
  }
}

public class Main1 {
  public static void main(String[] args) {
    Dog Dog1 = new Dog("Tommy");
    Dog1.makeSound();
    Dog1.eat();
    System.out.println(Dog1.hashCode());
  }
}
