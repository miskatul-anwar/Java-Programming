import java.util.LinkedHashSet;
import java.util.*;

public class linkedhashset {
  public static void main(String[] args) {
    LinkedHashSet<Integer> s = new LinkedHashSet<>();
    s.add(4);
    s.add(2);
    s.add(1);
    System.out.println(s);
    Iterator<Integer> it = s.Iterator();
    return;
  }
}
