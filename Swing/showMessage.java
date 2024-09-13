import javax.swing.JOptionPane;

class Hello {
    public void message() {
        JOptionPane.showMessageDialog(null,"Hello, World!","Warning",JOptionPane.WARNING_MESSAGE);
    }

    public void confirm() {
        JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm", JOptionPane.YES_NO_OPTION);
    }

    public void input() {
        JOptionPane.showInputDialog(null, "What is your name?");
    }
}
public class showMessage {
    public static void main(String[] args) {
        (new Hello()).input();
    }
}