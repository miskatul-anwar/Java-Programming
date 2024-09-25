import javax.swing.*;
import java.awt.*;

public class flow {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLayout(new FlowLayout(FlowLayout.CENTER));
    frame.add(new JButton("1"));
    frame.add(new JButton("2"));
    frame.add(new JButton("3"));
    frame.add(new JButton("4"));
    frame.add(new JButton("5"));
    frame.setVisible(true);
  }
}
