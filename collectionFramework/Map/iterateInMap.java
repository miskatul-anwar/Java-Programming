import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.ListSelectionModel;

/**
 * iterateInMap
 */
public class iterateInMap {
  public static void main(String[] args) {
    System.out.println("Ways to iterateInMap: ");
    // TreeMap<String, Integer> tm = new TreeMap<>();
    // HashMap<String, Integer> hm = new HashMap<>();
    Map<String, Integer> tm = Map.of(
        "one", 1,
        "two", 2,
        "three", 3);
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Hello");

    arrayList.forEach(it -> System.out.println(it));

    // tm.put("one", 1);
    // tm.put("two", 2);
    // tm.put("three", 3);
    // tm.put("one", 1);
    // tm.put("two", 2);
    // tm.put("three", 3);

    // Method I
    for (Map.Entry<String, Integer> entry : tm.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
    }

    // Method II
    for (String key : tm.keySet()) {
      System.out.println(key + " -> " + tm.get(key));
    }

    // Method III
    for (Integer val : tm.values()) {
      System.out.println("Value: " + val);
    }

    // Method IV
    tm.forEach((key, value) -> System.out.println(key + " + " + value));
    return;
  }
}
