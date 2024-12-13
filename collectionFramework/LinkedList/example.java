import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class example {
  public static void main(String[] args) {
    List<Integer> li = new LinkedList<>();
    li.add(5);
    li.add(6);
    li.add(7);
    li.add(8);
    li.add(9);
    for (Object i : li) {
      System.out.println(i);
    }
    Queue<Integer> qi = new PriorityQueue<>();
    qi.add(6);
    qi.add(5);
    qi.add(4);
    qi.add(3);
    qi.add(2);
    for (Integer integer : qi) {
      System.out.println(integer);
    }
  }
}
