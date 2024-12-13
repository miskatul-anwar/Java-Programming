
import java.util.HashMap;
import java.util.Map;

public class b {
  private Map<Integer, String> bookMap;

  public BookStore() {
    bookMap = new HashMap<>();
  }

  public void addBook(int id, String title) {
    bookMap.put(id, title);
  }

  public String searchBook(int id) {
    return bookMap.get(id);
  }

  public static void main(String[] args) {
    BookStore store = new BookStore();
    store.addBook(101, "Structured Programming");
    store.addBook(102, "Algorithms");
    store.addBook(103, "Operating Systems");

    System.out.println("Book with ID 102: " + store.searchBook(102));
  }
}
