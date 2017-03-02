package first.second.classes;

import first.second.db.ConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {
    static Connection currentCon = null;
    static ResultSet rs = null;

    public static Clients login(Clients clnt) {

        Statement stmt = null;

        String username = clnt.getLogin();
        String password = clnt.getPassword();

        String searchQuery = "SELECT * FROM users WHERE login='"
                + username
                + "' AND password='"
                + password
                + "'";

        System.out.println("Your username is " + username);
        System.out.println("Your password is " + password);
        System.out.println("Query: " + searchQuery);

        try {
            currentCon = ConnectionManager.getConnection();
            stmt = currentCon.createStatement();
            rs = stmt.executeQuery(searchQuery);
            boolean more = rs.next();

            if (username.equals("admin") && password.equals("admin")) {
                System.out.println("Hello admin");
                clnt.setAdmin(true);

            } else if (!more) {
                System.out.println("Sorry, you are not a registered user!");
                clnt.setValid(false);

            } else if (more) {
                String firstName = rs.getString("name");
                String lastName = rs.getString("last_name");
                int id = rs.getInt("id_user");

                System.out.println("Hello " + firstName);
                clnt.setName(firstName);
                clnt.setLast_name(lastName);
                clnt.setId(id);
                clnt.setValid(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    rs = null;
                }
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (Exception e) {

                    }
                    stmt = null;
                }
                if (currentCon != null) {
                    try {
                        currentCon.close();
                    } catch (Exception e) {

                    }
                    currentCon = null;
                }
            }
        }
        return clnt;
    }


    public static Clients checkLogin(Clients chck) {

        String login = chck.getLogin();

        String query = "SELECT login FROM users WHERE login ='" + login + "'";
        try {
            currentCon = ConnectionManager.getConnection();
            Statement stmt = currentCon.createStatement();
            rs = stmt.executeQuery(query);
            boolean more = rs.next();

            if (more) {
                System.out.println("This login is already in use");
                chck.setValid(false);
            } else {
                chck.setValid(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return chck;
    }
}