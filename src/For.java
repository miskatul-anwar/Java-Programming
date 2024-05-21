import com.utils.spec;

public class For {
  public static void main(String[] args) {
    int x = spec.getint();
    spec.println(x);
    for (int i = 0; i < x; i++) {
      spec.print(i);
    }
  }
}
