import java.awt.Color;

import javax.swing.*;

/**
 * One
 */
public class one {

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("Pluck my life");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420, 420);
    frame.setResizable(false);
    frame.setVisible(true);
    Color bg = new Color(115, 0, 0);
    frame.getContentPane().setBackground(bg);
  }
}
