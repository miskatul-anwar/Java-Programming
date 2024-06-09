import java.util.Scanner;

public class forloop {
  public static void main(String[] args) {
    int N;
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    for (int i = 0; i <= N; i++) {
      System.out.print(i + " ");
    }
    for (int i = 0; i <= args.length; i++) {
      System.out.println(i);
    }
    sc.close();
  }
}
