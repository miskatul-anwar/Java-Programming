interface Animal {
  void sound();
}

public class Lambda1 {
  public static void main(String[] args) {
    // With lambda 1000 times better!
    Animal cat1 = () -> {
      System.out.println("Meow!");
    };
    // Without lambda 👎 which are called inner classes!

    // Class with a name
    class Cat implements Animal {
      @Override
      public void sound() {
        System.out.println("Meow!");
      }
    }
    Cat cat3 = new Cat();
    // Anonymous
    Animal cat2 = new Animal() {
      @Override
      public void sound() {
        System.out.println("Meow!");
      }
    };
    cat1.sound();
    cat2.sound();
    cat3.sound();
  }
}
