import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class a {
  public static void main(String[] args) {
    String filePath = "numbers.txt";

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] numbers = line.split(",");
        int sum = 0;
        for (String num : numbers) {
          sum += Integer.parseInt(num.trim());
        }
        System.out.println(sum);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
