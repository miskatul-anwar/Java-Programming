class Functions {
  public static double smcFunc(final String x, final String y) {
    double f01 = 0, f10 = 0, f00 = 0, f11 = 0;
    for (int i = 0; i < x.length(); i++) {
      if (x.charAt(i) == '1' && y.charAt(i) == '0') {
        f10++;
      }
      if (x.charAt(i) == '0' && y.charAt(i) == '1') {
        f01++;
      }
      if (x.charAt(i) == '0' && y.charAt(i) == '0') {
        f00++;
      }
      if (x.charAt(i) == '1' && y.charAt(i) == '1') {
        f11++;
      }
    }
    return (f11 + f00) / (f01 + f10 + f11 + f00);
  }
}

public class smc {
  public static void main(String[] args) {
    String x = "1000000000";
    String y = "0000001001";
    System.out.println("Output: " + Functions.smcFunc(x, y));
  }
}
