import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ModernFileWrite {
  public static void main(String[] args) {
    Path path = Paths.get("new.txt");
    List<String> content = List.of("Line 1", "Line 2", "Line 3");
    try {
      Files.write(path, content);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
