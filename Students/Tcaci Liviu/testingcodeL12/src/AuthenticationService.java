import java.util.HashMap;
import java.util.Map;

public class AuthenticationService {

  Map<String, String> passwordByUsername = new HashMap<>();

  public boolean login(String username, String password) {
    // login logic
    String storedPassword = passwordByUsername.get(username);
    if (storedPassword != null && storedPassword.equals(password)) {
      // authentication successful
      return true;
    }
    // authentication failed
    return false;
  }
}