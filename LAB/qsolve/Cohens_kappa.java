import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Cohens_kappa {

  private double kappa = 0;

  public double cohens(String filename) {
    Path path = Paths.get(filename);
    List<String> lines;
    try {
      lines = Files.readAllLines(path);
      double total = lines.size();
      double fav = 0, aga = 0, fav_1 = 0, aga_1 = 0, fav_2 = 0, aga_2 = 0;

      for (String line : lines) {
        String[] eachword = line.split("\\s+");

        if (eachword[1].endsWith("r"))
          fav_1++;
        if (eachword[2].endsWith("r"))
          fav_2++;
        if (eachword[1].endsWith("t"))
          aga_1++;
        if (eachword[2].endsWith("t"))
          aga_2++;

        if (eachword[1].equals(eachword[2])) {
          if (eachword[1].endsWith("r"))
            fav++;
          if (eachword[1].endsWith("t"))
            aga++;
        }
      }

      double P_o = (fav + aga) / total;
      double P_e = (fav_1 / total * fav_2 / total) + (aga_1 / total * aga_2 / total);

      kappa = (P_o - P_e) / (1 - P_e);

    } catch (IOException e) {
      e.printStackTrace();
    }

    return (kappa == 0 ? -1 : kappa);
  }

  public static void main(String[] args) {
    System.out.println("Cohen's Kappa: " + new Cohens_kappa().cohens("annotator.txt"));
  }
}
