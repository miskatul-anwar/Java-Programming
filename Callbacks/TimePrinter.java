public interface ActionListener {
  void actionPerformed(ActionEvent event);
}

public class TimePrinter implements ActionListener {
  public void actionPerformed(ActionEvent event) {
    System.out.println("At the tone, the time is "
        + Instant.ofEpochMilli(event.getWhen()));
    Toolkit.getDefaultToolkit().beep();
  }

  public static void main(String[] args) {

  }
}
