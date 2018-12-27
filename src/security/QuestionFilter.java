package security;

import logic.DataSource;
import models.Question;
import models.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "QuestionFilter", urlPatterns = "/question")
public class QuestionFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        try {
            String cat = request.getParameter("c");
            int value = Integer.parseInt(request.getParameter("v"));
            Question question = DataSource.getQuestion(cat, value);
            if (((User) request.getSession(false).getAttribute("user")).getAttempts().containsKey(question)) {
                response.sendRedirect(request.getContextPath() + "/categories");
                return;
            } else req.setAttribute("question", question);
        } catch (Exception e) {
            response.sendRedirect(request.getContextPath() + "/categories");
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) {

    }

}
