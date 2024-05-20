import java.util.*;
import java.math.*;

class cassA {
  double sq(double t) {
    return Math.pow(t, 2);
  }
}

class cassB extends cassA {
  double root(double t, double x) {

    return (6 * super.sq(t)) / (Math.sqrt(t) + x);
  }
}

class cassC extends cassB {
  double division(double t, double x) {
    return Math.sqrt(super.root(t, x));
  }
}
