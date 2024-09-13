class function {
  int num1 = 9; // instance variable
  static int num2 = 8; // class variable

  public static void print(Object obj) {
    System.out.println(obj);
  }
}

public class variablesjava {

  public static void main(String[] args) {
    function obj = new function();
    function.print(obj.num1);
    function.print(function.num2);
    // System.out.printf("Hi I'm from the printf %.2f\n", 5.00);
  }
}
