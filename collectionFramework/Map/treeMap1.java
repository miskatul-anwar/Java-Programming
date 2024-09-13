import java.util.*;

public class treeMap1 {
  public static void main(String[] args) {
    TreeMap<String, Integer> hp = new TreeMap<>();
    hp.put("Bus", 2);
    hp.put("Car", 1);
    hp.put("Zeep", 1);
    hp.put("Plane", 1);
    System.out.println(hp);
    if (hp.containsKey("Bus")) {
      hp.putIfAbsent("Bus", 2);
    }
    if (hp.containsValue(2)) {
      System.out.println("Duo");
      System.out.println();
    }
    for (HashMap.Entry<String, Integer> e : hp.entrySet()) {
      System.out.println(e);
    }
    System.out.println();
    for (String Key : hp.keySet()) {
      System.out.println(Key);
    }
    return;
  }
}
