import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User(Long id, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = hashPassword(password);
    }

    public boolean isValid(String email, String password) {
        return this.email.equals(email) && this.password.equals(hashPassword(password));
    }

    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedHash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();

            for (byte b : encodedHash) {
                String hex = Integer.toHexString(0xff & b);
                hexString.append(hex.length() == 1 ? '0' : "").append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            // handle case where SHA-256 algorithm is not available
            throw new IllegalStateException("SHA-256 hashing algorithm is not available", e);
        }
    }
}