import cse.utils.*;
import java.lang.*;

class test {
  public static void counter(int n) {
    counter(n + 1);
  }
}

public class stackoverflow {
  public static void main(String[] args) throws StackOverflowError {
    test.counter(1);
  }
}
