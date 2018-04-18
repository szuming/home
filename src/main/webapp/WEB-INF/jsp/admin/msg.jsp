<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MING
  Date: 2018/4/2
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息提示</title>
</head>
<body>
<script>
    var message="${msg}";
    if(message!=""){
        alert(message)
    }
    setTimeout("javascript:location.href='home'", 1000);
</script>
<a href="home">即将自动返回，点此立刻返回主页</a>
</body>
</html>
