
class fourLegz {
  public void feature() {
    System.out.println("This has fourLegz");
  }
}

interface color {
  public void colorful() {
    System.out.println("This has color");
  }
}

class Dog extends fourLegz implements color {

  @override
  public void feature() {
    System.out.println("This has fourLegz and ");
  }

  @override
  public void colorful() {
    System.out.println("red color");
  }

}

public class Animal {
  public static void main(String[] args) {
    Dog foo = new Dog();
    foo.feature();
    return;
  }
}
