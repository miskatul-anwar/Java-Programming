import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Fruit {
  private String name;
  private int quantity;

  public Fruit(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public int getQuantity() {
    return quantity;
  }

  @Override
  public String toString() {
    return "Fruit{name='" + name + "', quantity=" + quantity + "}";
  }

  public static void main(String[] args) {
    List<Fruit> listFruit = new ArrayList<>();
    listFruit.add(new Fruit("Apple", 10));
    listFruit.add(new Fruit("Banana", 5));
    listFruit.add(new Fruit("Cherry", 10));
    listFruit.add(new Fruit("Date", 8));

    Comparator<Fruit> customComparator = (f1, f2) -> {
      int quantityComparison = Integer.compare(f2.getQuantity(), f1.getQuantity());
      if (quantityComparison != 0) {
        return quantityComparison;
      } else {
        return f1.getName().compareTo(f2.getName());
      }
    };

    Collections.sort(listFruit, customComparator);

    listFruit.forEach(System.out::println);
  }
}
