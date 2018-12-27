package servlets;

import logic.DataSource;
import models.AttemptState;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;

@WebServlet(
    name = "CategoriesServlet",
    urlPatterns = {"/categories"}
)
public class CategoriesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect(getServletContext().getContextPath() + "/");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (DataSource.getAllQuestions().stream()
            .filter(q -> q.getAttemptState() != AttemptState.CORRECT && q.getAttemptState() != AttemptState.INCORRECT)
            .collect(Collectors.toList()).size() == 0)
            response.sendRedirect(getServletContext().getContextPath() + "/");
        // TODO: Make a result page


        request.setAttribute("categories", DataSource.getCategoryList());
        request.setAttribute("questions", DataSource.getAllQuestions());
        request.getRequestDispatcher(getServletContext().getContextPath() + "categories.jsp")
            .forward(request, response);
    }
}
