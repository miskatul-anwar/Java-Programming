
public class asserTions {
  private static int checkAge(int x) {
    assert x >= 0 : "Age must be non-negative!";
    return x;
  }

  public static void main(String[] args) {
    System.out.println(checkAge(-1));
  }
}
