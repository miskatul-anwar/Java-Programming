class Animal {
  void makeSound() {
    System.out.println("Animal");
  }
}

class Dog extends Animal {
  void makeSound() {
    System.out.println("Dog");
  }
}

class Cat extends Dog {
  void makeSound() {
    super.makeSound();
  }
}

public class catdog {
  public static void main(String[] args) {
    Animal a = new Animal();
    Animal b = new Dog();
    Dog c = new Cat();
    Cat d = new Dog();
    a.makeSound();
    b.makeSound();
    c.makeSound();
    d.makeSound();
  }
}
