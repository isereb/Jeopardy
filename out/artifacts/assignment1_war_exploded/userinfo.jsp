<%@ page import="models.User" %>
<%
    HttpSession s = request.getSession(false);
    if (s == null) response.sendRedirect("/");
    assert s != null;
    User user = (User) s.getAttribute("user");
    assert user != null;
%>
<div class="user info">

    <div class="username">
        <%=user.getUsername()%>
    </div>

    <div class="balance">
        <i class="coin icon"></i> <%=user.getBalance()%>
    </div>

</div>
