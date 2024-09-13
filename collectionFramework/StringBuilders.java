import cse.utils.*;

public class StringBuilders {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("Hello");
    sb.append(", ");
    sb.append("World");
    spec.println(sb.charAt(0));
    // sb.setCharAt(0, '4');
    spec.print(sb);
    for (int i = 0; i < sb.length(); i++) {
      sb.setCharAt(i, (char) (sb.charAt(i) + 1));
    }
    spec.print(sb);
  }
}
