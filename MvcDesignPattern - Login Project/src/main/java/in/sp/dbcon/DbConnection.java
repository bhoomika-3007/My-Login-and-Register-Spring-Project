package in.sp.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

    // Static method to get database connection
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL Driver

        // Change DB name, username, password as per your setup
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/mvc_db",
            "root",
            "arunarun@1234"
        );
        return con;
    }
} 