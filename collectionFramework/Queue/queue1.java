import java.util.LinkedList;

public class queue1 {
  public static void main(String[] args) {
    LinkedList<Integer> queue = new LinkedList<>();
    queue.offer(12); // I can use add() here.
    queue.offer(24); // But It's dangerous
    queue.offer(36); // As it can throw exception
    System.out.println(queue);
    System.out.println(queue.peek()); // I can use element() here. But It's prohavited
    System.out.println(queue.element());
    queue.poll(); // we can definitely use the remove() but It throws exception
    System.out.println(queue);
  }
}
