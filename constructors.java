class Innerconstructors {
  int a, b;

  public Innerconstructors(int real, int imaginary) {
    a = real;
    b = imaginary;
  }

  void print() {
    System.out.println(a + ' ' + b + 'i');
  }

}

public class constructors {

  public static void main(String[] args) {
    Innerconstructors num1 = new Innerconstructors(11, 15);
    num1.print();
    return;
  }
}
