import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Q2 {
  public static void main(String[] args) {
    Path path = Paths.get("largest.txt");
    try {
      List<String> lines = Files.readAllLines(path);
      String biggest = "";
      for (String line : lines) {
        String[] each = line.split("\\s+");
        for (String string : each) {
          biggest = (biggest.length() < string.length() ? string : biggest);
        }
      }
      System.out.println(biggest);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
