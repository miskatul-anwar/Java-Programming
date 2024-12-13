class Dog {
    Dog() {
        System.out.println("This is a Dog!");
    }
}

class Cat {
    Cat() {
        System.out.println("This is a Cat!");
    }
}

public class Ref {
    public static void main(String[] args) {
        final Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog2 = null;
        Cat cat = new Cat();
        dog2 = cat;
        System.out.println(dog1);
    }
}
