import com.utils.spec;

public class array2 {
  public static void main(String[] args) {
    spec.print("Enter size: ");
    int size = spec.getint();
    int array[] = new int[size];
    spec.print("value to find: ");
    int x = spec.getint();
    for (int i = 0; i < size; i++) {
      array[i] = 4;
    }
    for (int it : array) {
      if (it == x) {
        spec.print("Value Found!");
      }
    }
    spec.nl();
    return;
  }
}
