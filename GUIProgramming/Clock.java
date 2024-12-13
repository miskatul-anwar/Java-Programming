import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

class MainFrame extends JFrame implements ActionListener {
  private JLabel label = new JLabel("Timer");
  private JButton button = new JButton("Start");
  private static Integer counter = 0;
  private Timer timer;

  MainFrame() {
    label.setFont(new Font("JetBrainsMono Nerd Font", Font.PLAIN, 14));

    this.setLayout(new FlowLayout());
    this.add(label);
    this.add(button);
    this.setSize(640, 480);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);

    button.addActionListener(this);

    timer = new Timer(1000, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        incrementByOne();
        label.setText(counter.toString());
      }
    });
  }

  public static Integer incrementByOne() {
    return counter++;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      timer.start();
    }
  }
}

public class Clock {
  public static void main(String[] args) {
    new MainFrame();
  }
}
