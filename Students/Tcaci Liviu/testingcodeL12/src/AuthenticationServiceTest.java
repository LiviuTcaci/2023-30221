import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AuthenticationServiceTest {

    AuthenticationService service;

    @BeforeEach
    public void setup() {
        service = new AuthenticationService();

        // Adding known user for testing
        service.passwordByUsername.put("testUser", "testPassword");
    }

    @Test
    public void testLoginSuccess() {
        // Testing known user and password
        assertTrue(service.login("testUser", "testPassword"));
    }

    @Test
    public void testLoginFailureWithUnknownUser() {
        // Testing unknown user
        assertFalse(service.login("unknownUser", "anyPassword"));
    }

    @Test
    public void testLoginFailureWithWrongPassword() {
        // Testing known user but wrong password
        assertFalse(service.login("testUser", "wrongPassword"));
    }
}