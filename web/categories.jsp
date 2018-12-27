<%@ page import="logic.AttemptStateUtil" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Jeopardy game | Categories</title>
    <link href="style/categories.css" type="text/css" rel="stylesheet">
    <link href="style/fw.css" type="text/css" rel="stylesheet">
    <link href="style/userinfo.css" type="text/css" rel="stylesheet">
</head>
<body>

<div class="main-container">
    <jsp:include page="userinfo.jsp"/>
    <div class="fw panel">
        <div class="header">
            Please select a question
        </div>
        <div class="fw two column grid">
            <div id="categories">
                <jsp:useBean id="categories" scope="request" type="java.util.List"/>
                <c:forEach items="${categories}" var="categ">
                    <div id="category" class="column">
                            ${categ.name}
                    </div>
                </c:forEach>
            </div>
            <div id="questions" class="fw five column grid">
                <jsp:useBean id="questions" scope="request" type="java.util.List"/>
                <c:forEach items="${questions}" var="q">
                    <div id="question" class="column">
                        <a href="${pageContext.request.contextPath}/question?c=${q.category}&v=${q.value}"
                           class="fw ${AttemptStateUtil.getClassByAttemptState(q.attemptState)} button">
                            <i class="coin icon"></i>
                            ${q.value}
                        </a>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>

</body>
</html>
