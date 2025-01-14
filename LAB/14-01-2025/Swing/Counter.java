import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame {
  private JButton jButton = new JButton("Increment");
  private JLabel jLabel = new JLabel("Counter: ");
  private JTextField jTextField = new JTextField("0");
  private int counter = 0;

  MyFrame() {
    this.setSize(300, 150);
    this.setResizable(false);
    this.setTitle("Counter Program");
    this.setAlwaysOnTop(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new BorderLayout(10, 10));

    JPanel inputPanel = new JPanel(new GridLayout(1, 2, 10, 10));
    jTextField.setEditable(false);
    inputPanel.add(jLabel);
    inputPanel.add(jTextField);

    // Add components to the frame
    this.add(inputPanel, BorderLayout.CENTER);
    this.add(jButton, BorderLayout.SOUTH);

    // Button action listener
    jButton.addActionListener(new ButtonActionListener());

    this.setVisible(true);
  }

  private class ButtonActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      counter++;
      jTextField.setText(Integer.toString(counter));
    }
  }
}

public class Counter {
  public static void main(String[] args) {
    new MyFrame();
  }
}
