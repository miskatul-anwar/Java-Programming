import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question01 {

  public static void main(String[] args) {
    Path fPath = Paths.get("./data.txt");
    Map<String, Integer> hm = new HashMap<>();

    try {
      List<String> lines = Files.readAllLines(fPath);
      for (String line : lines) {
        List<String> words = List.of(line.split("  "));
        if (words.get(1).equals("Null")) {
          hm.put(words.get(0), 0);
        } else {
          hm.put(words.get(0), Integer.parseInt(words.get(1)));
        }
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
    String player = "Player A";
    Integer increm = 50000;
    increaseSalary(hm, player, increm);

    List<String> content = new ArrayList<>();

    for (var i : hm.entrySet()) {
      content.add(i.getKey() + "  " + i.getValue());
    }

    try {
      Files.write(fPath, content);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void increaseSalary(Map<String, Integer> hm, String player, Integer increm) {
    hm.computeIfPresent(player, (key, value) -> value + increm);
  }
}
