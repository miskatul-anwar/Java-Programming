import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MainWindow extends JFrame {
  MainWindow() {
    this.setTitle("Input Text Example");
    this.setSize(400, 400);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    JLabel label = new JLabel("Enter something...");
    label.setBounds(50, 50, 150, 30);
    this.add(label);
    JTextField textField = new JTextField();
    textField.setBounds(50, 100, 200, 30);
    textField.setBounds(50, 100, 200, 30);
    this.add(textField);
    JButton button = new JButton("Submit");
    button.setBounds(50, 150, 100, 30);
    this.add(button);
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String input = textField.getText();
        System.out.println();
        label.setText("User Input: " + input);
      }
    });
    this.setVisible(true);
  }
}

public class SwingTextBox {
  public static void main(String[] args) {
    new MainWindow();
  }
}
