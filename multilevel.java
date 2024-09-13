import java.util.*;

class cassA {
  void print() {
    System.out.println("Hi");
  }
}

class cassB extends cassA {
  void print() {
    super.print();
    System.out.println("CSE");
  }
}

class cassC extends cassB {
  void print() {
    super.print();
  }
}

public class multilevel {
  public static void main(String[] args) {

  }
}
