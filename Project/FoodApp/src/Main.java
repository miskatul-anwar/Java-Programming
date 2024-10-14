import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;

class Rest {
  private String apiKey;
  private String endpoint;

  Rest(String recipe) {
    apiKey = "4e027227e5844d39b1183d39cafc6e62"; // Spoonacular API key
    endpoint = "https://api.spoonacular.com/recipes/complexSearch?apiKey=" +
        apiKey + "&query=" + recipe;
  }

  public String getResponse() {
    StringBuilder response = new StringBuilder();
    try {
      URL url = new URL(endpoint);
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod("GET"); // Set request method to GET

      int responseCode = connection.getResponseCode();

      if (responseCode == HttpURLConnection.HTTP_OK) {
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
          response.append(inputLine);
        }
        in.close();
      } else {
        System.out.println("GET request failed. Response Code: " + responseCode);
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
    return response.toString();
  }
}

class MainFrame extends JFrame {
  MainFrame() {
    Rest apicall = new Rest("Pizza");
    String response = apicall.getResponse();
    System.out.println(response);
    System.out.println(response);
    this.add(new JButton("Click"));
    this.setVisible(true);
  }
}

public class Main {
  public static void main(String[] args) {
    MainFrame mainFrame = new MainFrame();
  }
}
