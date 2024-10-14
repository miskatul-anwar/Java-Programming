import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue2 {
  public static void main(String[] args) {
    Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
    queue.offer(3.0);
    queue.offer(2.5);
    queue.offer(1.5);
    queue.offer(2.0);
    System.out.println(queue);
  }
}
