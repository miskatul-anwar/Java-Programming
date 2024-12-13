import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class c1 {
  public static void main(String[] args) {
    List<Double> dataList = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
      String line = br.readLine();
      String[] values = line.split(" ");
      for (String value : values) {
        dataList.add(Double.parseDouble(value));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("Data List: " + dataList);
  }
}
