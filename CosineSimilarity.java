import java.util.Map;
import java.util.HashMap;

class Functions {
  public static double cosineSimmilarity(final String s1, final String s2) {

    HashMap<String, Integer> map1 = new HashMap<>(),
        map2 = new HashMap<>();

    for (String word : s1.split(" ")) {
      map1.put(word, map1.getOrDefault(word, 0) + 1);
    }
    for (String word : s2.split(" ")) {
      map2.put(word, map2.getOrDefault(word, 0) + 1);
    }

    double dotProduct = 0.0,
        magnitude1 = 0.0,
        magnitude2 = 0.0;

    for (Map.Entry<String, Integer> entry : map1.entrySet()) {
      String word = entry.getKey();
      int freq = entry.getValue();
      dotProduct += freq * map2.getOrDefault(word, 0);
      magnitude1 += freq * freq;
    }
    for (int freq : map2.values()) {
      magnitude2 += freq * freq;
    }

    return dotProduct / (Math.sqrt(magnitude1) * Math.sqrt(magnitude2));
  }
}

public class CosineSimilarity {
  public static void main(String[] args) {
    String d1 = "the best data science course", d2 = "data science is popular";
    System.out.println(Functions.cosineSimmilarity(d1, d2));
  }
}
