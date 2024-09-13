import java.util.Stack;

public class stack1 {
  public static void main(String[] args) {
    Stack<String> animals = new Stack<>();
    animals.push("Lion");
    animals.push("Dog");
    animals.push("Cat");
    animals.push("Rat");
    animals.push("Bat");
    System.out.println(animals);
    System.out.println(animals.peek()); // LIFO
    animals.pop();
    System.out.println(animals.toString());
    return;
  }
}
