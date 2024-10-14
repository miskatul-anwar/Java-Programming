import java.util.HashMap;
import java.util.Map;

public class cosine_simmilarity {

  public static void main(String[] args) {
    String d1 = "the best data science course";
    String d2 = "data science is popular";

    System.out.println(cosineSimilarity(d1, d2));
  }

  public static double cosineSimilarity(String d1, String d2) {
    // Tokenize the strings and calculate word frequency
    Map<String, Integer> md1 = getWordFrequency(d1);
    Map<String, Integer> md2 = getWordFrequency(d2);

    // Calculate dot product and magnitudes
    double dotProduct = 0, magnitude1 = 0, magnitude2 = 0;

    for (var entry : md1.entrySet()) {
      String word = entry.getKey();
      int freq1 = entry.getValue();
      int freq2 = md2.getOrDefault(word, 0);

      dotProduct += freq1 * freq2;
      magnitude1 += freq1 * freq1;
    }

    for (var freq : md2.values()) {
      magnitude2 += freq * freq;
    }

    return dotProduct / (Math.sqrt(magnitude1) * Math.sqrt(magnitude2));
  }

  // Helper function to compute word frequency
  private static Map<String, Integer> getWordFrequency(String document) {
    Map<String, Integer> frequencyMap = new HashMap<>();
    String[] words = document.split("\\s+"); // Split the document by spaces
    for (String word : words) {
      frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
    }
    return frequencyMap;
  }
}
