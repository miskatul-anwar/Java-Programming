
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.io.FileReader;

public class Answer4 {
  public static void main(String[] args) {
    BufferedReader br = null;
    try {
      // Create a BufferedReader to read from the file "input.txt"
      br = new BufferedReader(new FileReader("input.txt"));

      // Use TreeMap to store and sort the key-value pairs
      TreeMap<String, Integer> track = new TreeMap<>();
      String line;

      // Read each line from the file
      while ((line = br.readLine()) != null) {
        // Split the line into key and value based on the hyphen
        String[] list = line.split("-");

        // Add the key-value pair to the TreeMap
        track.put(list[0], Integer.parseInt(list[1]));
      }

      // Print the first entry of the TreeMap
      if (!track.isEmpty()) {
        System.out.println(track.firstEntry());
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      // Close the BufferedReader
      try {
        if (br != null) {
          br.close();
        }
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
  }
}
