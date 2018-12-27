package security;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(
    filterName = "LoginFilter",
    urlPatterns = {
        "/categories",
        "/question",
        "/result"
    }
)
public class LoginFilter implements Filter {
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpSession session = ((HttpServletRequest) req).getSession(false);
        if (session != null && session.getAttribute("user") != null) chain.doFilter(req, resp);
        else ((HttpServletResponse) resp).sendRedirect(((HttpServletRequest) req).getContextPath() + "/");
    }

    public void init(FilterConfig config) {

    }


}
