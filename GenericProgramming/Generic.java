class Pair<T> {
  private T first;
  private T second;

  public Pair() {
    first = null;
    second = null;
  }

  public Pair(T first, T second) {
    this.first = first;
    this.second = second;
  }

  public T getFirst() {
    return first;
  }

  public T getSecond() {
    return second;
  }

  public void setFirst(T newValue) {
    first = newValue;
  }

  public void setSecond(T newValue) {
    second = newValue;
  }
}

public class Generic {
  public static void main(String[] args) {
    Pair<Integer> p = new Pair();
    p.setFirst(3);
    p.setSecond(8);
    System.out.println(p.getFirst() + p.getSecond());
  }
}
