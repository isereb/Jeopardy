package servlets;

import com.google.gson.JsonObject;
import models.AttemptState;
import models.Question;
import models.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
    name = "QuestionServlet",
    urlPatterns = {"/question"}
)
public class QuestionServlet extends HttpServlet {

    // Post used to submit the answer
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Question question;
        try {
            question = (Question) request.getAttribute("question");
            int option = Integer.parseInt(request.getParameter("option"));

            User user = (User) request.getSession(false).getAttribute("user");
            JsonObject jsonResponse = new JsonObject();
            if (question.getOptionList().get(option).isCorrect()) {
                question.setAttemptState(AttemptState.CORRECT);
                user.setBalance(user.getBalance() + question.getValue());
                jsonResponse.addProperty("correct", true);
            } else {
                question.setAttemptState(AttemptState.INCORRECT);
                user.setBalance(user.getBalance() - question.getValue());
                jsonResponse.addProperty("correct", false);
                for (int i = 0; i < question.getOptionList().size(); i++) {
                    if (question.getOptionList().get(i).isCorrect()) {
                        jsonResponse.addProperty("option", i);
                        break;
                    }
                }

            }
            response.getWriter().println(jsonResponse);
        } catch (Exception e) {
            response.sendError(500);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            Question question = (Question) request.getAttribute("question");
            question.setAttemptState(AttemptState.SEEN);
            request.setAttribute("question", question);
            request.getRequestDispatcher(getServletContext().getContextPath() + "question.jsp")
                .forward(request, response);
        } catch (Exception e) {
            response.sendRedirect(getServletContext().getContextPath() + "/categories");
        }
    }

}

