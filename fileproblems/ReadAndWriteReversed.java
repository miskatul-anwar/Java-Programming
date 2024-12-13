import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndWriteReversed {
  public static void main(String[] args) {
    String fileName = "data.txt";
    try (BufferedReader bw = new BufferedReader(new FileReader(fileName))) {
      String line;
      while ((line = bw.readLine()) != null) {
        String strNumbers[] = line.split(" ");
        int sumNumbers = 0;
        for (String string : strNumbers) {
          sum += Integer.parseInt(string);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
