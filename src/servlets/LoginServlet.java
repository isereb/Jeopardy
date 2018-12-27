package servlets;

import models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(
    name = "LoginServlet",
    urlPatterns = {"/login"}
)
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");

        if (username == null) {
            response.sendRedirect(getServletContext().getContextPath());
            return;
        }

        HttpSession session = request.getSession();
        session.setAttribute("user", new User(username, 0));
        response.sendRedirect(getServletContext().getContextPath() + "/categories");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect(getServletContext().getContextPath());
    }
}
