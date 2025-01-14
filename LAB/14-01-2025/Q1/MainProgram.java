import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

class Pair<K, V> {
  private final K key;
  private final V value;

  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "(" + key + ", " + value + ")";
  }
}

public class MainProgram {
  public static void main(String[] args) {
    Path filePath = Paths.get("./data.txt");
    Map<Integer, Pair<Integer, Integer>> rainMap = new HashMap<>();
    Map<Integer, Pair<Integer, Integer>> tempMap = new HashMap<>();
    Map<Integer, Pair<Integer, Integer>> humidMap = new HashMap<>();

    try {
      List<String> lines = Files.readAllLines(filePath);

      for (String line : lines) {
        List<String> values = List.of(line.split(" "));
        Integer distId = Integer.parseInt(values.get(0));
        Integer temp = Integer.parseInt(values.get(2));
        Integer humid = Integer.parseInt(values.get(3));
        Integer rain = Integer.parseInt(values.get(4));

        updateMap(tempMap, distId, temp);
        updateMap(humidMap, distId, humid);
        updateMap(rainMap, distId, rain);
      }

      writeAveragesToFile(tempMap, "temperature.txt");
      writeAveragesToFile(humidMap, "humidity.txt");
      writeAveragesToFile(rainMap, "rain.txt");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void updateMap(Map<Integer, Pair<Integer, Integer>> map, Integer distId, Integer value) {
    map.compute(distId, (k, v) -> {
      if (v == null) {
        return new Pair<>(value, 1); // New entry
      } else {
        return new Pair<>(v.getKey() + value, v.getValue() + 1); // Update existing
      }
    });
  }

  // Method to write averages to file
  private static void writeAveragesToFile(Map<Integer, Pair<Integer, Integer>> map, String fileName)
      throws IOException {
    List<String> lines = new ArrayList<>();
    map.forEach((key, pair) -> {
      if (pair != null) {
        double average = (double) pair.getKey() / pair.getValue();
        lines.add(key + " " + average);
      }
    });
    Files.write(Paths.get("./" + fileName), lines, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
  }
}
