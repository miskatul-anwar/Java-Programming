class func {
  public static int fact(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return n * fact(n - 1);
  }
}

public class factorial {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    System.out.println(func.fact(n));
  }
}
