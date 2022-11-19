package ExpInTransaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
        String username = "postgres";
        String password = "root";
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Opened database successfully");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            try {
                assert connection != null;
                connection.close();
            } catch (SQLException ignored) {

            }
        }
    }


}
