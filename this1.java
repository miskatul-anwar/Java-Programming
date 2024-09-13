class Complex {
  int a, b;

  public Complex(int a, int b) {
    this.a = a;
    this.b = b;
  }

  void print() {
    System.out.println(a + " + " + b + "i");
  }

  Complex add(Complex num2) {
    Complex newnum = new Complex(a + num2.a, b + num2.b);
    return newnum;
  }
}

public class this1 {
  public static void main(String[] args) {
    Complex num1 = new Complex(11, 15);
    Complex num2 = new Complex(11, 15);
    num1.print();
    Complex res = num1.add(num2);
    res.print();
    return;
  }
}
