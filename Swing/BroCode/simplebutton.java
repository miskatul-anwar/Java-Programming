import javax.swing.JButton;
import javax.swing.JFrame;

public class simpleButton {

  public static void main(String[] args) {
    // Create the frame
    JFrame frame = new JFrame();

    // Create the button
    JButton button = new JButton();
    button.setBounds(200, 100, 100, 50);
    button.setText("CLICK");

    // Add action listener using lambda expression
    button.addActionListener(e -> System.out.println("Button clicked!"));

    // Set up the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setSize(500, 500);

    // Add the button to the frame
    frame.add(button);

    // Make the frame visible
    frame.setVisible(true);
  }
}
