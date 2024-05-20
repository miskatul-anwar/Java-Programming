import java.util.*;
import java.math.*;

class m1 {
  public static double sq(double t) {
    return Math.sqrt(t);
  }
}

class m2 {
  public static double po(double t) {
    return Math.pow(t, 2);
  }
}

class classA {
  double div(double t, double x) {
    return 6 * m1.po(t) / m2.sq(t);
  }
}
