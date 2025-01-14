import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jaccard {
  public static void main(String[] args) {
    String doc1 = "Data is the new oil of digital economy";
    String doc2 = "Data is a new oil";
    List<String> doc1L = List.of(doc1.split(" "));
    List<String> doc2L = List.of(doc2.split(" "));

    List<String> uniq = new ArrayList<>();
    Set<String> merged = new HashSet<>();

    merged.addAll(doc1L);
    merged.addAll(doc2L);

    for (String string : doc1L) {
      if (doc2L.contains(string)) {
        uniq.add(string);
      }
    }

    System.out.println((double) uniq.size() / merged.size());
  }
}
