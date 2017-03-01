package first.second.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");

            try {
                con = DriverManager.getConnection(DbContract.HOST + DbContract.DB_NAME,
                        DbContract.USERNAME, DbContract.PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return con;
    }
}
