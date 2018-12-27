package security;

import logic.DataSource;
import models.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "ResultFilter", urlPatterns = "/result")
public class ResultFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpSession session = ((HttpServletRequest) req).getSession(false);
        if (((User) session.getAttribute("user")).getAttempts().size() == DataSource.getAllQuestions().size())
            chain.doFilter(req, resp);
        else
            ((HttpServletResponse) resp).sendRedirect(((HttpServletRequest) req).getContextPath() + "/categories");
    }

    public void init(FilterConfig config) {

    }

}
