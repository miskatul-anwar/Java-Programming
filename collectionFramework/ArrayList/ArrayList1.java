import java.util.ArrayList;

public class ArrayList1 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(0, 30);
    for (Integer i : list) {
      System.out.println(i);
    }
    // list.remove(1);
    // list.remove(Integer.valueOf(30));
    // list.remove(10);
    System.out.println(list.toString());
    return;
  }
}
