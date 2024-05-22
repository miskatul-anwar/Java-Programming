import cse.utils.*;

// interface Animals {
//   void walk();
// }

abstract class Animals {
  abstract void walk();
}

class Chicken extends Animals {
  public void walk() {
    spec.println("Chickens walk on 2 legs");
  }
}

class Dog extends Animals {
  public void walk() {
    spec.println("Dogs walk on 4 legs");
  }
}

class Horse extends Animals {
  public void walk() {
    spec.println("Horses walk on 4 legs");
  }
}

public class abstraction {
  public static void main(String args[]) {
    Horse h = new Horse();
    h.walk();
    Dog d = new Dog();
    d.walk();
    Chicken c = new Chicken();
    c.walk();
    return;
  }
}
