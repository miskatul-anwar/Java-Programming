class utils {
  public static void print(Object obj) {
    System.out.print(obj);
  }

  public static void println(Object obj) {
    System.out.println(obj);
  }

  public static void nl() {
    System.out.println();
  }
}

public class matrix {
  public static void main(String[] args) {
    int array[][] = { { 2, 2 }, { 2, 2 } };
    for (int it[] : array) {
      for (int itr = 0; itr < it.length; itr++) {
        it[itr] = 5;
      }
      utils.nl();
    }
    for (int it[] : array) {
      for (int itr : it) {
        utils.print(itr + " ");
      }
      utils.nl();
    }
    utils.nl();
    return;
  }
}
