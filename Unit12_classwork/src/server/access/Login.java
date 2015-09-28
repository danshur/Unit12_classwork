package server.access;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class Login {
  
  private static final String URL = "https://server-access.domain.com";
  
  public static String getToken(String username, String password) throws IOException {
    URL url = new java.net.URL(String.format(URL, username, password));
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    conn.setRequestProperty("username", username);
    conn.setRequestProperty("password", password);
    BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
    String token = br.readLine();
    conn.disconnect();
    return token;
  }
}
