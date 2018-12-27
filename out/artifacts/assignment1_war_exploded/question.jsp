<jsp:useBean id="question" scope="request" type="models.Question"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Jeopardy game | ${question.category}</title>
    <link href="style/question.css" type="text/css" rel="stylesheet">
    <link href="style/fw.css" type="text/css" rel="stylesheet">
    <link href="style/userinfo.css" type="text/css" rel="stylesheet">
    <script type="text/javascript">
        var path = "${pageContext.request.contextPath}";
        var category = "${question.category}";
        var value = ${question.value};
    </script>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="js/question.js"></script>
</head>
<body>

<div class="main-container">

    <div class="fw panel">
        <div class="header">
            <div class="grid">
                <div class="category">
                    ${question.category}
                </div>
                <div class="value">
                    <i class="coin icon"></i> ${question.value}
                </div>
                <div class="skip">
                    <a href="${pageContext.request.contextPath}/categories">
                        <i class="skip icon"></i>
                    </a>
                </div>
            </div>
        </div>
        <div class="question header">
            ${question.text}
        </div>
        <div class="options">
            <c:forEach items="${question.optionList}" var="o">
                <div id="${question.optionList.indexOf(o)}" class="option">
                    ${o.text}
                </div>
            </c:forEach>
        </div>
    </div>
</div>
</body>
</html>