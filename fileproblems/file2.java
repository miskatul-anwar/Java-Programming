import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.sound.midi.SysexMessage;

public class file2 {
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
      String[] tokens = filedata.split(delims);
      int word;

      for (int i = 0; i < tokens.length; i++) {
        try {
          word = Integer.parseInt(tokens[i]);
          if (word % 2 == 0) {
            even.write((word + " ") + "\n");
          } else {
            odd.write((word + " ") + "\n");
          }
        } catch (IOException exp) {
          System.out.println(exp);
          System.exit(-1);
        }
      }

      ins.close();
      odd.close();
      even.close();

    } catch (IOException exp) {
      System.out.println(exp);
      System.exit(-1);
    }
  }
}
