<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MING
  Date: 2018/4/1
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${message}</title>
</head>
<body>
<c:choose>
    <c:when test="${message eq 'suc'}">
        <h1>welcome,${username}</h1>
        <p><a href="userinfo.jsp">请更新个人信息</a></p>
    </c:when>
    <c:otherwise>
        用户名已被使用，请<a href="/toReg">返回</a>
    </c:otherwise>
</c:choose>


</body>
</html>
