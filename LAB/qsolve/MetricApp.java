import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MetricApp {

  class detectionSystem {
    private String filename;
    private Path path = Paths.get("conf.txt");
    private List<String> lines;
    private String[] eachword;
    private int tp = 0, fp = 0, fn = 0, tn = 0;

    private double r, p, f1_score, acc;

    public detectionSystem(String filename) {
      this.filename = filename;
    }

    public double[] scanFile() throws IOException {
      lines = Files.readAllLines(path);
      for (var line : lines) {
        eachword = line.split("\\s+");
        if (eachword[1].equals(eachword[2])) {
          if (eachword[1].endsWith("r"))
            tp++;
          if (eachword[1].endsWith("t"))
            tn++;
        } else {
          if (eachword[2].endsWith("t"))
            fn++;
          if (eachword[2].endsWith("r"))
            fp++;
        }
      }
      r = (double) tp / (tp + fn);
      p = (double) tp / (tp + fp);
      f1_score = 2 * (p * r) / (p + r);
      acc = (double) (tp + tn) / (tp + fp + fn + tn);
      return new double[] { f1_score, acc };
    }
  }

  public void createWindow() {
    JFrame frame = new JFrame("Detection Metrics");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel f1Label = new JLabel("F1 Score: Calculating...");
    JLabel accLabel = new JLabel("Accuracy: Calculating...");

    JButton button = new JButton("Show Metrics");

    frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

    f1Label.setAlignmentX(JComponent.CENTER_ALIGNMENT);
    accLabel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
    button.setAlignmentX(JComponent.CENTER_ALIGNMENT);

    frame.add(Box.createVerticalGlue());
    frame.add(f1Label);
    frame.add(accLabel);
    frame.add(button);
    frame.add(Box.createVerticalGlue());

    frame.setSize(300, 200);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);

    button.addActionListener(e -> {
      try {
        detectionSystem detection = new detectionSystem("conf.txt");
        double[] metrics = detection.scanFile();
        f1Label.setText("F1 Score: " + String.format("%.2f", metrics[0] * 100) + "%");
        accLabel.setText("Accuracy: " + String.format("%.2f", metrics[1] * 100) + "%");
      } catch (IOException ex) {
        f1Label.setText("Error calculating F1 Score.");
        accLabel.setText("Error calculating Accuracy.");
        ex.printStackTrace();
      }
    });
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> new MetricApp().createWindow());
  }
}
