public class UserRepository {
    public User save(User user) {

        return user;
    }

    public User findById(Long id) {
        /* Add your own SQL operations here. */
        return null; // Replace with actual retrieved User
    }

    public User findByEmail(String email) {
        /* Add your own SQL operations here. */
        return null; // Replace with actual retrieved User
    }

    public User update(User user) {
        /* Add your own SQL operations here. */
        return user; // Return the updated user
    }

    public void deleteById(Long id) {
        /* Add your own SQL operations here. */
    }
}