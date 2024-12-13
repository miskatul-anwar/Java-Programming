import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Modify {
  private Path path = Paths.get("salary.txt");
  private List<String> lines;
  private Map<String, Integer> map = new HashMap<>();

  public void showFile() throws IOException {
    System.out.println("The Contents of the file: ");
    lines = Files.readAllLines(path);
    for (var line : lines) {
      System.out.println(line);
    }
  }

  public void update(String name, int value) throws IOException {
    lines = Files.readAllLines(path);
    for (var line : lines) {
      String[] eachword = line.split("\\s+");
      map.put(eachword[0], Integer.parseInt(eachword[1]));
    }

    if (map.containsKey(name)) {
      map.replace(name, map.get(name) + value);

      StringBuilder sb = new StringBuilder();
      for (var entry : map.entrySet()) {
        sb.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
      }

      Files.write(path, sb.toString().getBytes());

      System.out.println("Updated " + name + " with new value: " + map.get(name));
    } else {
      System.out.println("Name not found in the file.");
    }
  }
}

public class Salary {

  public static void main(String[] args) {
    Modify modify = new Modify();

    try {
      modify.update("PlayerC", 50000);
      modify.showFile();

    } catch (IOException e) {
      System.out.println("Error reading or updating the file: " + e.getMessage());
    }
  }
}
