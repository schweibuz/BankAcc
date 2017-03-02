package first.second.classes;

import first.second.db.ConnectionManager;

import java.sql.*;
import java.util.*;
import java.util.Date;

public class ClientsDAO {

    public static List<Clients> getClients(String check) throws SQLException, ClassNotFoundException {

        String query = "SELECT name, last_name, land, city, address, credit_card," +
                "phone_number, email, login, password, reg_date FROM users WHERE login ='" + check + "'";
        try (Connection c = ConnectionManager.getConnection();        //try и круглые скобки-в JDK7 сам закроетконнект (try с ресурсами)
             PreparedStatement ps = c.prepareStatement(query);
             ResultSet resultSet = ps.executeQuery();
        ) {

            ArrayList<Clients> clientss = new ArrayList<Clients>();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String last_name = resultSet.getString("last_name");
                String land = resultSet.getString("land");
                String city = resultSet.getString("city");
                String address = resultSet.getString("address");
                String credit_card = resultSet.getString("credit_card");
                String phone = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String login = resultSet.getString("login");
                String password = resultSet.getString("password");
                java.sql.Timestamp reg_date = resultSet.getTimestamp("reg_date");

                clientss.add(new Clients(name, last_name, land, city, address, credit_card,
                        phone, email, login, password, reg_date));

                System.out.println("post clients");
            }
            System.out.println("ClientsGet");
            return clientss;
        }
    }


    public static List<Clients> getAccount(int check) throws SQLException, ClassNotFoundException {
        String query = "SELECT salary, raise_salary, income, description FROM account WHERE id_user ='" + check + "'";
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(query);
             ResultSet resultSet = ps.executeQuery();
        ) {
            ArrayList<Clients> account = new ArrayList<Clients>();
            while (resultSet.next()) {
                int salary = resultSet.getInt("salary");
                int raise_salary = resultSet.getInt("raise_salary");
                int income = resultSet.getInt("income");
                String description = resultSet.getString("description");

                account.add(new Clients(salary, raise_salary, income, description));
            }
            return account;
        }
    }


    public static void deleteClients(int id) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM users WHERE id_user=?";
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(query);
        ) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }


    public static void addClients(String name, String last_name, String land, String city, String address,
                                  String phone_number, String email, String credit_card, String login, String password)
            throws SQLException, ClassNotFoundException, IllegalArgumentException {
        String query = "WITH rows AS (" +
                "INSERT INTO users (name, last_name, land, city, address, credit_card, " +
                "phone_number, email, login, password, reg_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING id_user)" +
                "INSERT INTO account(id_user) " +
                "SELECT id_user FROM rows";

        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(query);
        ) {
            ps.setString(1, name);
            ps.setString(2, last_name);
            ps.setString(3, land);
            ps.setString(4, city);
            ps.setString(5, address);
            ps.setString(6, credit_card);
            ps.setString(7, phone_number);
            ps.setString(8, email);
            ps.setString(9, login);
            ps.setString(10, password);
            java.util.Date date = new Date();
            java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());
            ps.setTimestamp(11, timestamp);


            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println(ConnectionManager.getConnection().getMetaData().getDatabaseProductName());
    }
}