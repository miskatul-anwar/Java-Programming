import java.util.Collections;

public class ReverseList {
  public static void main(String[] args) {
    List<Double> dataList = new ArrayList<>();
    // agertai likhsi kivabe file read krbo 🌚
    Collections.addAll(dataList, 1.0, 19.5, 8.0, 77.0, 25.0, 27.4, 3.99, 89.0, 5.35, 80.0);

    List<Double> reversedList = new ArrayList<>(dataList);
    Collections.reverse(reversedList);

    System.out.println("Reversed List: " + reversedList);
  }
}
