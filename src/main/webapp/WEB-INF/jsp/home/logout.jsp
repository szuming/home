<%--
  Created by IntelliJ IDEA.
  User: MING
  Date: 2018/4/1
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注销账号</title>
</head>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注销</title>
</head>
<body>
<%
    Object o=session.getAttribute("username");
    if(o==null){
        return;
    }
    session.invalidate();
    response.sendRedirect("home.jsp");
%>
</body>
</html>
</body>
</html>
