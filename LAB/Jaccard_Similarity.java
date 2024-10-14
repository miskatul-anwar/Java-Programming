import java.util.*;
import java.util.stream.Collectors;

public class Jaccard_Similarity {
  public static void main(String[] args) {
    String doc_1 = "Data is the new oil of digital economy";
    String doc_2 = "Data is a new oil";

    // Split the strings into words and store them in lists
    List<String> l1 = new ArrayList<>(Arrays.asList(doc_1.split("\\s+")));
    List<String> l2 = new ArrayList<>(Arrays.asList(doc_2.split("\\s+")));

    // Create copies of the lists to preserve originals
    List<String> tmp1 = new ArrayList<>(l1);
    List<String> tmp2 = new ArrayList<>(l2);

    // Union of the lists
    Set<String> unionSet = new HashSet<>(l1);
    unionSet.addAll(l2); // Adds all unique elements from both lists

    // Intersection of the lists
    tmp1.retainAll(tmp2); // This modifies tmp1 to contain only the intersection

    // The size of the intersection and union
    int intersectionSize = tmp1.size();
    int unionSize = unionSet.size();

    // The Jaccard similarity is the size of the intersection divided by the size of
    // the union
    float jaccardSimilarity = (float) intersectionSize / unionSize;

    System.out.println("Jaccard similarity: " + jaccardSimilarity);
  }
}
