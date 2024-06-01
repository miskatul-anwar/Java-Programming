import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class file1 {
  public static void main(String[] args) {
    FileOutputStream fout = new FileOutputStream("./new.txt");
    DataOutputStream out = new DataOutputStream(fout);
    out.writeDouble(10.0);
    // out.writeDouble(10.0);
    // out.writeDouble(10.0);
    // out.writeDouble(10.0);
    // out.writeDouble(10.0);
    out.close();

    FileInputStream fin = new FileInputStream("./new.txt");
    DataInputStream in = new DataInputStream(fin);
    double d = in.readDouble();
    System.out.println(d);
    in.close();
    return;
  }
}
