import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Q1 {
  public static void main(String[] args) {
    Path path = Paths.get("data.txt");
    try {
      List<String> lines = Files.readAllLines(path);
      Scanner scanner = new Scanner(System.in);
      int option = scanner.nextInt();
      switch (option) {
        case 1:
          for (String string : lines) {
            System.out.println(string);
          }
          break;
        case 2:
          String course = scanner.next();
          int flag = 0;
          for (String string : lines) {
            String[] rec = string.split("\\s+|,");
            if (rec[0].equals(course)) {
              System.out.println("The Students in the " + rec[0] + " course:");
              for (int i = 1; i < rec.length; i++) {
                System.out.printf(rec[i].equals(" ") ? "" : rec[i] + " ");
              }
              System.out.println();
              flag++;
              break;
            }
          }
          System.out.println(flag == 0 ? "Not Found" : " ");
          break;
        default:
          for (String string : lines) {
            System.out.println(string);
          }
          break;
      }
      scanner.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
