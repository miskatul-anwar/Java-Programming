import java.util.HashMap;
import java.util.Map;

public class Cosine {

  public static void main(String[] args) {
    String d1 = "the best data science course";
    String d2 = "data science is popular";
    System.out.println(cosineSimilarity(d1, d2));
  }

  public static double cosineSimilarity(String d1, String d2) {
    // Create frequency maps for the words in each string
    Map<String, Integer> md1 = new HashMap<>();
    Map<String, Integer> md2 = new HashMap<>();

    // Populate frequency map for d1
    for (String word : d1.split(" ")) {
      md1.put(word, md1.getOrDefault(word, 0) + 1);
    }

    // Populate frequency map for d2
    for (String word : d2.split(" ")) {
      md2.put(word, md2.getOrDefault(word, 0) + 1);
    }

    // Calculate dot product and magnitudes
    double dotProduct = 0, magnitude1 = 0, magnitude2 = 0;

    for (Map.Entry<String, Integer> entry : md1.entrySet()) {
      String word = entry.getKey();
      int freq1 = entry.getValue();
      int freq2 = md2.getOrDefault(word, 0);
      dotProduct += freq1 * freq2;
      magnitude1 += freq1 * freq1;
    }

    for (int freq : md2.values()) {
      magnitude2 += freq * freq;
    }

    // Return cosine similarity
    return dotProduct / (Math.sqrt(magnitude1) * Math.sqrt(magnitude2));
  }
}
