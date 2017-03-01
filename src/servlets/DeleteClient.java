package servlets;

import first.second.classes.ClientsDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "DeleteClient")
public class DeleteClient extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        try {
            ClientsDAO.deleteClients(id);
            response.sendRedirect("/PostAdmin");
        } catch (SQLException | ClassNotFoundException e1) {
            e1.printStackTrace();
        }
    }
}
