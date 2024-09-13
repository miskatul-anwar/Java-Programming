import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

  public Main() {
    setTitle("Drawing Shapes");
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(new DrawingPanel());
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      Main frame = new Main();
      frame.setVisible(true);
    });
  }

  class DrawingPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);

      // drawing triangle
      Polygon t = new Polygon();
      t.addPoint(100, 100);
      t.addPoint(150, 150);
      t.addPoint(50, 150);
      g.drawPolygon(t);

      // drawing rectangle
      g.drawRect(10, 10, 30, 140);

      // drawing circle
      g.drawOval(150, 50, 90, 90);

      // drawing ellipse
      g.drawOval(100, 10, 75, 50);
    }
  }
}
