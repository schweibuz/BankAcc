package first.second.tests;

import java.sql.*;
import first.second.db.DbContract;

public class TestConnection {

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection c = DriverManager.getConnection(
                    DbContract.HOST + DbContract.DB_NAME,
                    DbContract.USERNAME,
                    DbContract.PASSWORD);
            System.out.println(c.getMetaData().getDatabaseProductName());
            System.out.println("DB connected");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
