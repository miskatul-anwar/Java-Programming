import java.lang.Thread;
public class Threadx extends Thread {
 public void run() {
   System.out.println("Hello....");
 }
 public static void main(String[] args) {
  Threadx t1 = new Threadx();
  t1.start();
 }
}
