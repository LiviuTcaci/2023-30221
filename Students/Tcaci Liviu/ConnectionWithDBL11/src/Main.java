import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/Orders";
        String user = "root";
        String password = "password";

        try {
            // Establish a connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // Execute a SQL query
            String query = "SELECT * FROM Employee";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Process the result set
            while (resultSet.next()) {
                // Access data from the result set
                String columnName = resultSet.getString("EmployeeName");
                // Perform operations with the data
                System.out.println("Employee Name: " + columnName);
            }

            // Close resources
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}