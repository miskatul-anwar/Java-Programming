import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * labes
 */

public class labes {

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setVerticalAlignment(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.TOP);
    label.setForeground(Color.GREEN);
    label.setBackground(new Color(0, 0, 0));
    label.setIconTextGap(-1);
    label.setText("Bro, do you even code ?");
    frame.add(label);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setVisible(true);
    frame.setLayout(null);
    frame.setResizable(false);
    frame.pack();
  }
}
