import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/**
 * layeredpane
 */
public class layeredpane {

  public static void main(String[] args) {
    JLabel label1 = new JLabel();
    label1.setOpaque(true);
    label1.setBackground(Color.red);
    label1.setBounds(50, 50, 200, 200);
    JLabel label2 = new JLabel();
    label2.setOpaque(true);
    label2.setBackground(Color.green);
    label2.setBounds(100, 100, 200, 200);
    JLabel label3 = new JLabel();
    label3.setBackground(Color.blue);
    label3.setOpaque(true);
    label3.setBounds(150, 150, 200, 200);

    JLayeredPane layeredPane = new JLayeredPane();
    layeredPane.setBounds(0, 0, 500, 500);

    layeredPane.add(label1);
    layeredPane.add(label2);
    layeredPane.add(label3);

    JFrame frame = new JFrame("layeredpane");
    frame.add(layeredPane);
    frame.setSize(new Dimension(500, 500));
    frame.setLayout(null);
    frame.setVisible(true);
  }
}
