import java.util.HashMap;
import java.util.Map;

/**
 * cosineSimilarity
 */
class Functions {
  public static double cosineSim(final String s1, final String s2) {
    Map<String, Integer> map1 = new HashMap<>();
    Map<String, Integer> map2 = new HashMap<>();
    for (var it : s1.split(" ")) {
      map1.put(it, map1.getOrDefault(it, 0) + 1);
    }
    for (var it : s2.split(" ")) {
      map2.put(it, map2.getOrDefault(it, 0) + 1);
    }
    double dotProduct = 0.0, magni1 = 0.0, magni2 = 0.0;
    for (var entry : map1.entrySet()) {
      String word = entry.getKey();
      int freq = entry.getValue();
      dotProduct += freq * map2.getOrDefault(word, 0);
      magni1 += Math.pow(freq, 2);
    }
    for (var freq : map2.values()) {
      magni2 += Math.pow(freq, 2);
    }
    return dotProduct / (Math.sqrt(magni1) * Math.sqrt(magni2));
  }
}

public class cosineSimilarity {
  public static void main(String[] args) {
    String doc1 = "the best data science course";
    String doc2 = "data science is popular";
    System.out.println(Functions.cosineSim(doc1, doc2));
    return;
  }
}
