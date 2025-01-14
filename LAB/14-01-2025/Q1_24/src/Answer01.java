import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Answer01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter the course name: ");
    String courseName = scanner.nextLine().trim();
    scanner.close();

    Map<String, String> courseData = new HashMap<>();
    Path filePath = Paths.get("./data.txt");

    try {
      List<String> lines = Files.readAllLines(filePath);

      for (String line : lines) {
        List<String> splitLine = List.of(line.split("  "));
        if (splitLine.size() >= 2) {
          courseData.put(splitLine.get(0), splitLine.get(1));
        }
      }

    } catch (IOException e) {
      System.err.println("Error reading the file: " + e.getMessage());
      return;
    }

    String courseInfo = courseData.get(courseName);
    if (courseInfo != null) {
      System.out.println(courseInfo);
    } else {
      System.out.println("Course not found.");
    }
  }
}
