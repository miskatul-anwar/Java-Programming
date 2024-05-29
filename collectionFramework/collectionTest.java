import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import cse.utils.*;

public class collectionTest {
  public static void main(String[] args) {
    ArrayList<String> a1 = new ArrayList<>();
    // a1.add("CU");
    // a1.add("CSE");
    // a1.add("Legends");
    // a1.add("2023");
    for (String f : a1) {
      spec.println(f);
    }
    Collections.sort(a1);
    Scanner sc = new Scanner(System.in);
    String key = sc.next();
    sc.close();
    System.out.println("Searching for: " + key);
    int result = Collections.binarySearch(a1, key);
    System.out.println((result >= 0 ? "Found at index " + result : "Not Found " + result));
    return;
  }
}
