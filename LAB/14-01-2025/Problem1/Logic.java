import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class Logic {
  public static void main(String[] args) {
    Path oldmast = Paths.get("./oldmast.txt");
    Path newmast = Paths.get("./newmast.txt");
    Path trans = Paths.get("./trans.txt");

    List<String> lines = Files.readAllLines(oldmast);
    Map<String, Double> map = new HashMap<>();

    for (String line : lines) {
      List<String> values = List.of(line.split(" "));
      map.put(values.get(0), map.getOrDefault(values.get(0) + Integer.parseInt(values.get(1))));
    }

    List<String> lines2 = Files.readAllLines(trans);

    for (String line : lines2) {
      List<String> values = List.of(line.split(" "));
      map.put(values.get(0), map.getOrDefault(values.get(0), Integer.parseInt(values.get(1))));
    }
  }
}
