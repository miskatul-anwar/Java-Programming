import java.util.HashMap;
import java.util.Map;

public class cosineSimmilariy {
  public static double cosineSimilarity(String d1, String d2) {
    Map<String, Integer> md1 = new HashMap<>();
    Map<String, Integer> md2 = new HashMap();
    int pos = 0;
    String word;
    String d1Copy = d1;
    String d2Copy = d2;

    while ((pos = d1Copy.indexOf(" ")) != -1) {
      word = d1Copy.substring(0, pos);
      md1.put(word, md1.getOrDefault(word, 0) + 1);
      d1Copy = d1Copy.substring(pos + 1);
    }
    if (!d1Copy.isEmpty()) {
      md1.put(d1Copy, md1.getOrDefault(d1Copy, 0) + 1);
    }

    pos = 0;
    while ((pos = d2Copy.indexOf(" ")) != -1) {
      word = d2Copy.substring(0, pos);
      md2.put(word, md2.getOrDefault(word, 0) + 1);
      d2Copy = d2Copy.substring(pos + 1);
    }
    if (!d2Copy.isEmpty()) {
      md2.put(d2Copy, md2.getOrDefault(d2Copy, 0) + 1);
    }

    double dotProduct = 0;
    double magnitude1 = 0;
    double magnitude2 = 0;

    for (Map.Entry<String, Integer> entry : md1.entrySet()) {
      String word1 = entry.getKey();
      int freq1 = entry.getValue();
      dotProduct += freq1 * md2.getOrDefault(word1, 0);
      magnitude1 += Math.pow(freq1, 2);
    }

    for (Map.Entry<String, Integer> entry : md2.entrySet()) {
      String word2 = entry.getKey();
      int freq2 = entry.getValue();
      magnitude2 += Math.pow(freq2, 2);
    }

    return dotProduct / (Math.sqrt(magnitude1) * Math.sqrt(magnitude2));
  }

  public static void main(String[] args) {
    String d1 = "the best data science course";
    String d2 = "data science is popular";
    System.out.println(cosineSimilarity(d1, d2));
  }
}
