package servlets;

import first.second.classes.Clients;
import first.second.classes.ClientsDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "/PostClient")
public class PostClient extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            Clients checkUser = (Clients) request.getSession().getAttribute("currentSessionUser");

            request.setAttribute("clients", ClientsDAO.getClients(checkUser.getLogin()));
            request.getRequestDispatcher("/jsp/Account.jsp").forward(request, response);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
