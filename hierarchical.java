import java.util.*;
import java.math.*;

class classA {
  double sq(double t) {
    return Math.sqrt(t);
  }

  double po(double t) {
    return Math.pow(t, 2);
  }

  double div(double x, double y) {
    return x / y;
  }
}

class classB extends classA {
  double nom(double t) {
    return 6 * super.po(t);
  }
}

class classC extends classA {
  double denom(double t, double x) {
    return super.sq(t) + x;
  }
}

public class hierarchical {
  public static void main(String[] args) {

  }
}
