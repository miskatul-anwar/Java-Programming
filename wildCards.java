import java.util.List;

public class wildCards {
  public static void printList(List<?> list) {
    for (Object obj : list) {
      System.out.println(obj);
    }
  }

  public static void main(String[] args) {
    List<String> stringList = List.of("Apple", "Banana", "Cherry");
    printList(stringList);
  }
}
