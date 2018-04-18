<%--
  Created by IntelliJ IDEA.
  User: MING
  Date: 2018/4/1
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增同乡会</title>
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
    <h1 style="text-align: center">创立同乡会</h1>
    <form class="from-inline" action="addTown" method="post">
        <div class="form-group">
            <label for="hname">同乡会名称:</label>
            <input type="text" class="form-control" id="hname"  name="hname" placeholder="hname">
        </div>
        <div class="form-group">
            <label for="hintro">简介:</label>
            <input type="text" class="form-control" id="hintro"  name="hintro" placeholder="hintro">
        </div>
        <button type="submit" class="btn btn-success">创建</button>
        <input type="button" class="btn btn-default pull-right" value="返回"
               onclick="javascrtpt:window.location.href='home.jsp'">
    </form>
</div>
</body>
</html>
