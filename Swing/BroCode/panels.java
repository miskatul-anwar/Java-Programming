import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * panels
 */
public class panels {

  public static void main(String[] args) {
    JPanel panel_black = new JPanel();
    panel_black.setBackground(Color.black);
    panel_black.setBounds(0, 0, 250, 250);
    JPanel panel_red = new JPanel();
    panel_red.setBackground(Color.red);
    panel_black.setBounds(250, 0, 250, 250);
    JPanel panel_green = new JPanel();
    panel_green.setBackground(Color.green);
    panel_green.setBounds(0, 250, 500, 250);
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setSize(750, 750);
    frame.add(panel_black);
    frame.add(panel_red);
    frame.add(panel_green);
    frame.setResizable(true);
    frame.setVisible(true);
  }
}
