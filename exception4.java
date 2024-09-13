import java.util.ArrayList;
import cse.utils.spec;

public class exception4 {
  public static void main(String[] args)
      throws ArrayIndexOutOfBoundsException, ArithmeticException, NoSuchMethodException {
    ArrayList<Integer> array = new ArrayList<Integer>(7);
    array.add(6);
    // spec.hi("hi");
    // how to implement noshuchmethod ? excepection
    // spec.println(7 / 0);
    spec.println(array.get(7));
  }
}
