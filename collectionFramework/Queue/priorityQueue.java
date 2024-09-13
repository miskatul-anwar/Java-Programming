import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.offer(40);
    pq.offer(30);
    pq.offer(10);
    pq.offer(20);
    // PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
    // pq2 = pq;
    System.out.println(pq);
    System.out.println(pq2);
    System.out.println(pq.peek());
    System.out.println(pq.peek());
  }
}
