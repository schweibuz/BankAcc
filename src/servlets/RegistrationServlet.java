package servlets;

import first.second.classes.Clients;
import first.second.classes.ClientsDAO;
import first.second.classes.LoginDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String login = request.getParameter("user");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String last_name = request.getParameter("last_name");
        String land = request.getParameter("country");
        String city = request.getParameter("city");
        String address = request.getParameter("address");
        String phone_number = request.getParameter("phone_number");
        String email = request.getParameter("email");
        String credit_card = request.getParameter("credit_card");

        Clients checkLogin = new Clients();
        checkLogin.setLogin(login);
        checkLogin.setName(name);
        checkLogin.setLast_name(last_name);
        try {
            HttpSession session = request.getSession(true);
            checkLogin = LoginDAO.checkLogin(checkLogin);

            if(checkLogin.isValid()) {
                session.setAttribute("currentSessionUser", checkLogin);
                ClientsDAO.addClients(name, last_name, land, city, address, phone_number, email, credit_card, login, password);
                response.sendRedirect("/jsp/successRegistration.jsp");
            } else {
                response.sendRedirect("/jsp/RegistrationPage.jsp");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
