
import java.io.IOException;

import server.access.Login;


public class Example {
  public static void main(String[] args) throws IOException {
    Login.getToken(args[0], args[1]);
  }
}

