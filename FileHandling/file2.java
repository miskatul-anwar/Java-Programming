import java.io.*;
import java.lang.*;

public class file2 {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
    String s = "HEllo";
    bw.write(s);
    bw.close();
    return;
  }
}
