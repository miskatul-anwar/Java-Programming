import java.io.*;

/**
 * file3
 */
public class file3 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("output.txt"));
    String str;
    if ((str = br.readLine()) != null) {
      System.out.println(str);
    }
    br.close();
    return;
  }
}
