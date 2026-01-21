package infrastructure;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
            "jdbc:mariadb://localhost:3306/ecommerce";
    private static final String USER = "root";
    private static final String PASSWORD = "mypass";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            throw new RuntimeException("Cannot connect to DB", e);
        }
    }
}
