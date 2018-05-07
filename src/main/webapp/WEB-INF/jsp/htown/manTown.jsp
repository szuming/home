<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MING
  Date: 2018/4/3
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理同乡会</title>
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

    <link rel="stylesheet" href="../../../statics/css/home.css">

    <!--jquery.validate-->
    <script src="../../../statics/js/jquery.validate.min.js" ></script>
    <script src="http://malsup.github.io/jquery.form.js"></script>
</head>
<body>
<div class="container">
    <h1 style="text-align: center">
        修改同乡会信息：
    </h1>
    <form class="from-inline" action="manTown" method="post">
        <div class="form-group">
            <label for="hname">同乡会:</label>
            <input type="text" class="form-control" id="hname" name="hname" value="${town.hname}" disabled="disabled">
        </div>
        <div class="form-group">
            <label for="hnum">乡会人数:</label>
            <input type="text" class="form-control" id="hnum" name="hnum" value="${town.hnum}" disabled="disabled">
        </div>
        <div class="form-group">
            <label for="hintro">简介:</label>
            <input type="text" class="form-control" id="hintro" name="hintro" value="${town.hintro} ">
        </div>
        <input type="hidden" class="form-control" id="hid" name="hid" value="${town.hid}">
        <button type="submit" class="btn btn-success">修改信息</button>
        <input type="button" class="btn btn-default pull-right" value="返回"
               onclick="javascrtpt:window.location.href='home.jsp'">
    </form>
    <form class="from-inline" action="manTownImg" method="post" enctype="multipart/form-data">
        <div class="form-group">
            <label for="himg">同乡会图片</label>
            <input type="file" class="form-control" id="himg" name="himg" width="120px" >
            <input type="submit" value="上传">
        </div>
        <div class="form-group">
            <label for="hImgName">乡会人数:</label>
            <input type="hidden" class="form-control" id="hImgName" name="hImgName" value="${town.hname}">
        </div>
    </form>

</div>

<h1 class="page-header"></h1>
<div class="container">
    <h1 style="text-align: center">
        同乡会成员名单：
    </h1>

    <table class="table table-striped table-bordered">
        <thead>
        <tr>
            <th>用户名</th>
            <th>电话号码</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="users" items="${users}">
            <tr>
                <td>${users.username}</td>
                <td>${users.userphone}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>



<h1 class="page-header"></h1>
<div class="container">
    <h1 style="text-align: center">
        管理员名单：
    </h1>

    <table class="table table-striped table-bordered">
        <thead>
        <tr>
            <th>用户名</th>
            <th>电话号码</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="manUsers" items="${manUsers}">
        <tr>
            <td>${manUsers.username}</td>
            <td>${manUsers.userphone}</td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
    <form class="from-inline" action="manUser" method="post">
        <div class="form-group">
            <label for="username">新增管理员用户名:</label>
            <input type="text" class="form-control" id="username" name="username" >
            <button type="submit" class="btn btn-success">增加管理员</button>
        </div>
    </form>
</div>



<h1 class="page-header"></h1>
<div class="container">
    <h1 style="text-align: center">
        申请入会名单：
    </h1>
    <table class="table table-striped table-bordered">
        <thead>
        <tr>
            <th>用户名</th>
            <th>真实姓名</th>
            <th>电话号码</th>
            <th>邮箱</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="applyers" items="${applyers}">
        <tr>
            <td>${applyers.username}</td>
            <td><p><a href="manUser?jid=${applyers.jid}&jhid=${applyers.jhid}&juid=${applyers.juid}&allow=no"  class="btn btn-danger" role="button">拒绝</a> <a href="manUser?jid=${applyers.jid}&jhid=${applyers.jhid}&juid=${applyers.juid}&allow=yes" class="btn btn-primary" role="button">批准</a></p></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
