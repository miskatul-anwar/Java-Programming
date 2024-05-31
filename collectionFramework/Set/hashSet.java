import java.util.HashSet;

public class hashSet {
  public static void main(String[] args) {
    HashSet<Integer> s = new HashSet<>();
    s.add(4);
    s.add(1);
    s.add(1);
    s.add(2);
    s.add(3);
    System.out.println(s);
    System.out.println(s.contains(3));
    s.clear();
    System.out.println(s);
    return;
  }
}
