import java.util.*;

/**
 * Jaccard2
 */
public class Jaccard2 {
  public static void main(String[] args) {
    String s1 = "Data is the new oil of digital economy";
    String s2 = "Data is a new oil";
    String temp = s1 + " " + s2;
    HashSet<String> uni = new HashSet<>();
    HashSet<String> Omi1 = new HashSet<>();
    HashSet<String> Omi2 = new HashSet<>();

    for (String word : temp.split(" ")) {
      uni.add(word);
    }

    for (String word : s1.split(" ")) {
      Omi1.add(word);
    }

    for (String word : s2.split(" ")) {
      Omi2.add(word);
    }

    int count = 0;
    for (String i : Omi1) {
      if (Omi2.contains(i)) {
        count++;
      }
    }

    int n = uni.size();
    System.out.println((double) count / n);
    return;
  }
}
