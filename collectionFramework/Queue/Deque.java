import java.util.ArrayDeque;

/**
 * Deque
 */
public class Deque {
  public static void main(String[] args) {
    ArrayDeque<Integer> adq = new ArrayDeque<>();
    adq.offer(1);
    adq.offer(2);
    adq.offer(3);
    adq.offer(5);
    System.out.println(adq.peekFirst());
    System.out.println(adq.peekLast());
    System.out.println(adq);
    adq.poll();
    System.out.println(adq);
    adq.pollFirst();
    System.out.println(adq);
    adq.pollLast();
    System.out.println(adq);
    return;
  }
}
