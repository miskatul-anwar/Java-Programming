import java.util.Map;
import java.util.TreeMap;

public class treeMap1 {
  public static void main(String[] args) {
    Map<String, Integer> tp = new TreeMap<>();
    tp.put("Bus", 2);
    tp.put("Car", 1);
    tp.put("Zeep", 1);
    tp.put("Plane", 1);
    System.out.println(tp);
    if (tp.containsKey("Bus")) {
      tp.putIfAbsent("Bus", 2);
    }
    if (tp.containsValue(2)) {
      System.out.println("Duo");
      System.out.println();
    }
    for (Map.Entry<String, Integer> e : tp.entrySet()) {
      System.out.println(e);
    }
    System.out.println();
    for (String Key : tp.keySet()) {
      System.out.println(Key);
    }
    return;

  }
}
