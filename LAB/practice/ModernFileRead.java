import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class PlayerSalaries {
  public static void main(String[] args) {
    Path filePath = Paths.get("players.txt");

    try {
      List<String> lines = Files.readAllLines(filePath);

      for (String line : lines) {
        String[] parts = line.split("\\s+");

        if (parts.length == 2) {
          String playerName = parts[0];
          String salary = parts[1].equalsIgnoreCase("null") ? "Salary not available" : parts[1];
          System.out.println("Name: " + playerName + ", Salary(BDT): " + salary);
        } else {
          System.out.println(line);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
