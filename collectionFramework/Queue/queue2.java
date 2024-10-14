import java.util.LinkedList;
import java.util.Queue;

public class queue2 {
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    queue.offer("Karen");
    queue.offer("Chad");
    queue.offer("Steve");
    queue.offer("Harold");
    System.out.println(queue.contains("Harold"));
  }
}
