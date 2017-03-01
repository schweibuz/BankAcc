package servlets;

import first.second.classes.AdminDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddSalary")
public class AddSalary extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String id = request.getParameter("id");
        String salary = request.getParameter("salary");
        String raise_salary = request.getParameter("raise_salary");
        String income = request.getParameter("income");
        String description = request.getParameter("description");

        AdminDAO.addSalary(id, salary, raise_salary, income, description);
        response.sendRedirect("/PostAdmin");
    }

}
