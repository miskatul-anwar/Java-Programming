class Pair<T, U> {
  private T first;
  private U second;

  public T getFirst() {
    return this.first;
  }

  public U getSecond() {
    return this.second;
  }

  public void setFirst(T newVal) {
    this.first = newVal;
  }

  public void setSecond(U newVal) {
    this.second = newVal;
  }
}

class Twins<T extends Pair> {
  public void name() {
    System.out.println(super.first);
  }
}

public class Main1 {
  public static void main(String[] args) {
    Pair<Integer, Integer> foo = new Pair<Integer, Integer>();
    foo.setFirst(12);
    foo.setSecond(12);
    System.out.println(foo.getFirst());
    System.out.println(foo.getSecond());
    Twins<String> boo = new Twins<String>();
    boo.name();
    return;
  }
}
