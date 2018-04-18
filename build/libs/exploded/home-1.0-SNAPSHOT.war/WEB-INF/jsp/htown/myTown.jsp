<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MING
  Date: 2018/4/1
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的同乡会</title>
    <!-- 在bootstrap.min.js 之前引入 -->
    <script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>

    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <!--font-awesome CSS 文件-->
    <link rel="stylesheet" href="../../../statics/font-awesome-4.7.0/css/font-awesome.min.css">

    <link rel="stylesheet" href="../../../statics/css/htownBase.css">
</head>
<body>
<%@ include file="../home/header.jsp" %>
<div class="container">
    <table class="table table-striped table-bordered">
        <tbody>
        <tr>
            <td class="table-name">同乡会名称</td>
            <td class="table-value">${h.hname}</td>
        </tr>
        <tr>
            <td class="table-name">简介</td>
            <td class="table-value">${h.hintro}</td>
        </tr>
        <tr>
            <td class="table-name">乡会人数</td>
            <td class="table-value">${h.hnum}</td>
        </tr>
        </tbody>
    </table>
    <hr>
    <h1>成员列表：</h1>
    <table class="table table-striped table-bordered">
        <thead>
        <tr>
            <th>用户名</th>
            <th>电话号码</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach var="item" items="${userList}">
            <tr>
                <td>${item.username}</td>
                <td>${item.userphone}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
