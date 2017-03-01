package servlets;

import first.second.classes.Clients;
import first.second.classes.LoginDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {

            Clients client = new Clients();
            client.setLogin(request.getParameter("user"));
            client.setPassword(request.getParameter("password"));

            HttpSession session = request.getSession(true);
//            session.setMaxInactiveInterval(4);
            client = LoginDAO.login(client);

            if (client.isValid()) {
                session.setAttribute("currentSessionUser", client);
//                response.sendRedirect("/jsp/Account.jsp");
                response.sendRedirect("/PostClient");
            } else if (client.isAdmin()) {
                session.setAttribute("currentSessionAdmin", client);
                response.sendRedirect("/PostAdmin");
            } else {
//                response.sendRedirect("/html/errorRegistration.html");
                response.sendRedirect("/jsp/LoginPage.jsp");
            }
        } catch (Throwable theException) {
            System.out.println(theException);
        }
    }
}