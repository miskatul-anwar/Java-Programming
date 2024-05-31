import java.util.Scanner;

public class string {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    scan.close();
    for (int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i) + " ");
    }
  }
}
