<%--
  Created by IntelliJ IDEA.
  User: iisereb
  Date: 5/17/2018
  Time: 6:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Jeopardy game</title>
    <link href="style/index.css" type="text/css" rel="stylesheet">
    <link href="style/fw.css" type="text/css" rel="stylesheet">
  </head>
  <body>

    <div class="main-container">

      <div class="fw panel">
        <div class="header">
          Sign In
          <div class="subheader">
            Please enter your username
          </div>
        </div>
        <div class="login">
          <form action="login" method="post">
            <input name="username" class="fw input" type="text" placeholder="Username">
            <button class="fw button">Proceed</button>
          </form>
        </div>
      </div>

    </div>
  </body>
</html>
