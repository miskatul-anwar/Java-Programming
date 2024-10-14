import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {

  public static void main(String[] args) {
    // Create the main window (JFrame)
    JFrame mainFrame = new JFrame("Main Window");

    // Create a button
    JButton openButton = new JButton("Open New Window");
    openButton.setBounds(100, 100, 200, 50);

    // Add action listener to the button
    openButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // When button is pressed, open a new window
        openNewWindow();
      }
    });

    // Set up the main frame
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setSize(400, 400);
    mainFrame.setLayout(null);
    mainFrame.add(openButton);
    mainFrame.setVisible(true);
  }

  // Method to open a new window
  public static void openNewWindow() {
    JFrame newFrame = new JFrame("New Window");
    newFrame.setSize(300, 200);
    newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Only close new window
    newFrame.setVisible(true);
  }
}
