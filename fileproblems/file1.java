import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file1 {
  public static void main(String[] args) {
    File inFile = new File("num.txt");
    File oddFile = new File("odd.txt");
    File evenFile = new File("even.txt");
    BufferedReader ins = null;
    FileWriter odd = null;
    FileWriter even = null;
    try {
      ins = new BufferedReader(new FileReader(inFile));
      odd = new FileWriter(oddFile);
      even = new FileWriter(evenFile);
      String intr = "";
      String filedata = "";
      while ((intr = ins.readLine()) != null) {
        filedata += intr + " ";
      }
      String delims = " ";
      String[] token = filedata.split(delims);
      int word;
      for (int i = 0; i < token.length; i++) {
        word = Integer.parseInt(token[i]);
        if (word % 2 == 0) {
          even.write(word + " ");
        } else {
          odd.write(word + " ");
        }
      }
    } catch (IOException exp) {
      System.out.println(exp);
      System.exit(-1);
    }
  }
}
