package servlets;

import first.second.classes.AdminDAO;
import first.second.classes.Clients;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "/PostAdmin")
public class PostAdmin extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = "admin";
        String password = "admin";
        Clients admin = new Clients(login, password);

        try {
            Clients clAdmin = (Clients) request.getSession().getAttribute("currentSessionAdmin");

            if (admin.getLogin().equals(clAdmin.getLogin()) && admin.getPassword().equals(clAdmin.getPassword())) {

                System.out.println("session");
                request.setAttribute("employees", AdminDAO.getAllUsers());
                request.getRequestDispatcher("/jsp/Admin.jsp").forward(request, response);
            } else {
                response.sendRedirect("/html/errorRegistration.html");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}