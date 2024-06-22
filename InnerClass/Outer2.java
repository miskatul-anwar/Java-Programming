import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Outer2 {
  private int value = 0;

  public void someMethod() {
    JButton button = new JButton("Click me!");
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked! Value: " + Outer.this.value);
      }
    });
  }
}
