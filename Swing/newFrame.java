import javax.swing.JFrame;

class mainFrame extends JFrame {
    public void optFrame() {
        setTitle("Frame Title");
        setSize(300, 200);
        setVisible(true);
    }
}

public class newFrame {
    public static void main(String[] args) {
        (new mainFrame()).optFrame();
    }
}
