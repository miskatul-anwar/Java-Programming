class constructorC {
  constructorC(String s) {
    System.out.println(s);
  }
}

class sample1 {
  void methodA() {
    System.out.println("Method-s1");
  }
}

class sample2 extends sample1 {

  void methodA() {
    System.out.println("MethodA-s2");
  }

  void methodB() {
    System.out.println("MethodB");
  }
}

public class micellenious {
  public static void main(String[] args) {
    sample1 objs = new sample1();
    objs.methodA();
    objs = new sample2();
    objs.methodA();
    constructorC objs2 = new constructorC("HI");
    function.print(objs2);
  }
}
