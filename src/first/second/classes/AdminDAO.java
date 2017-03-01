package first.second.classes;

import first.second.db.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDAO {

    public static List<Clients> getAllUsers() throws SQLException, ClassNotFoundException {
        String query = "SELECT users.id_user, name, last_name, land, city, address, credit_card," +
                "phone_number, email, login, password, reg_date, salary, raise_salary, " +
                "income, account.description FROM users, account";

        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(query);

             ResultSet resultSet = ps.executeQuery();
        ) {

            ArrayList<Clients> clientss = new ArrayList<Clients>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id_user");
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
                int salary = resultSet.getInt("salary");
                int raise_salary = resultSet.getInt("raise_salary");
                int income = resultSet.getInt("income");
                String description = resultSet.getString("description");

                clientss.add(new Clients(id, name, last_name, land, city, address, credit_card,
                        phone, email, login, password, reg_date, salary, raise_salary, income, description));

            }
            System.out.println("AdminDAO");
            return clientss;
        }
    }


    public static void addSalary(String id, String salary, String raise_salary, String income, String description) {

        String query = "UPDATE account " +
                "SET  salary = ?, raise_salary= ?, income= ?, description = ?" +
                "WHERE id_user='" + id + "'";

        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(query);
        ) {
            ps.setInt(1, Integer.parseInt(salary));
            ps.setInt(2, Integer.parseInt(raise_salary));
            ps.setInt(3, Integer.parseInt(income));
            ps.setString(4, description);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
