import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Answer02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String string = scanner.next();
    scanner.close();
    List<String> list = List.of(string.split(" "));
    Map<Integer, String> tMap = new TreeMap<>();

    for (String word : list) {
      tMap.put(word.length(), word);
    }

    List<String> list2 = new ArrayList<>();
    for (String word : tMap.values()) {
      list2.add(word);
    }

    System.out.println(list2.getLast());
  }
}
