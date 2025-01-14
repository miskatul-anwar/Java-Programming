public class Smc {
  public static void main(String[] args) {
    String x = "1000000000";
    String y = "0000001001";
    System.out.println(calcSmc(x, y));
  }

  private static Double calcSmc(String x, String y) {
    int f01 = 0, f10 = 0, f11 = 0, f00 = 0;

    for (int i = 0; i < x.length(); i++) {
      if (x.charAt(i) == y.charAt(i)) {
        if (x.charAt(i) == '1') {
          f11++;
        } else {
          f00++;
        }
      } else {
        if (x.charAt(i) == '1') {
          f10++;
        } else {
          f01++;
        }
      }
    }

    double result = ((double) f11 + f00) / (f00 + f11 + f10 + f01);
    return result;
  }
}
