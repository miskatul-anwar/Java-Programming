import java.util.HashMap;
import java.util.Map;

public class Similarity {
  public static void main(String[] args) {
    Map<String, Integer> simpleMap = new HashMap<String, Integer>();
    simpleMap.put("Std1", 60);
    simpleMap.put("Std2", 61);
    simpleMap.put("Std3", 62);
    simpleMap.put("Std4", 63);
    simpleMap.put("Std5", 64);
    simpleMap.put("Std6", 65);
    simpleMap.put("Std7", 66);
    System.out.println(simpleMap);
    // System.out.println(simpleMap.get("Std1"));
    for (String mapKey : simpleMap.keySet()) {
      System.out.println(mapKey + " " + simpleMap.get(mapKey));
    }
    return;
  }
}
