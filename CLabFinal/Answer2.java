// package CLabFinal;

import java.util.Scanner;

class Answer2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt(), y = sc.nextInt();
    String input = sc.next();
    sc.close();
    for (char it : input.toCharArray()) {
      if (it == 'U') {
        y++;
      } else if (it == 'D') {
        y--;
      } else if (it == 'R') {
        x++;
      } else {
        x--;
      }
    }
    System.out.println(x + " " + y);
    return;
  }
}
