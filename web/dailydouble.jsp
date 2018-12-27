<jsp:useBean id="question" scope="session" class="models.Question"/>
<jsp:setProperty name="question" property="question"/>
<%@ page import="models.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jeopardy game | Daily Double!</title>
    <link href="style/dailydouble.css" type="text/css" rel="stylesheet">
    <link href="style/fw.css" type="text/css" rel="stylesheet">
</head>
<body>

<%
    User user = (User) request.getSession().getAttribute("user");
%>
<div class="main-container">

    <div class="fw panel">
        <div class="header">
            Daily Double!
            <div class="subheader">
                Please enter new value of your question<br>
                Value can vary between 1 and <%= user.getMaxBetValue() %>
            </div>
        </div>
        <div class="login">
            <form action="${pageContext.request.contextPath}/dailydouble" method="post">
                <input name="dd" class="fw input" type="number" placeholder="Question value">
                <input name="q" value="${question.index}" type="hidden">
                <button class="fw button">Proceed</button>
            </form>
        </div>
        <%
            if (request.getAttribute("errors") != null) {
                Object[] errors = (Object[]) request.getAttribute("errors");
        %>
        <div class="errors">
            Error!
            <% for (Object err : errors) { %>
            <div class="error">
                - <%=err%><br>
            </div>
            <% } %>
        </div>
        <% } %>
    </div>

</div>

</body>
</html>
