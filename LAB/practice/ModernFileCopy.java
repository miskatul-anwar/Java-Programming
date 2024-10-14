import java.nio.file.*;

public class FileCopyExample {
  public static void main(String[] args) {
    Path source = Paths.get("source.txt");
    Path target = Paths.get("destination.txt");

    try {
      Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
      System.out.println("File copied successfully!");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
