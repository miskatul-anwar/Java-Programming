import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jaccard {
  public static void main(String[] args) {
    String doc1 = "Data is the new oil of digital economy",
        doc2 = "Data is a new oil";
    List<String> l1, l2, tmp1, tmp2;
    l1 = new ArrayList<>();
    l2 = new ArrayList<>();
    for (String word : doc1.split(" ")) {
      l1.add(word);
    }
    for (String word : doc2.split(" ")) {
      l2.add(word);
    }
    System.out.println("Original list 1: " + String.join(" ", l1));
    System.out.println("Original list 2: " + String.join(" ", l2));
    l1.addAll(l2);
    Collections.sort(l1);
    l1 = new ArrayList<>(new java.util.LinkedHashSet<>(l1));
    int b = l1.size();
    tmp1 = new ArrayList<>(l1);
    tmp2 = new ArrayList<>(l2);
    Collections.sort(tmp1);
    Collections.sort(tmp2);
    int count = 0;
    for (String word : tmp1) {
      if (tmp2.contains(word)) {
        count++;
        tmp2.remove(new Integer(tmp2.indexOf(word)));
      }
    }
    int a = count;
    float jaccard = (float) a / b;
    System.out.println("Jaccard similarity: " + jaccard);
  }
}
