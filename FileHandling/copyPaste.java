import java.io.*;
// Write a program of copy the contents of a file named “INPUT.DAT” into a file
// called “OUPUT.DAT”.

public class copyPaste {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("input.dat"));
    String str;
    if ((str = br.readLine()) != null) {
      System.out.println(str);
    }
    br.close();
    BufferedWriter bw = new BufferedWriter(new FileWriter("output.dat"));
    // bw.write(str);
    bw.append(str);
    bw.close();
    return;
  }
}
