<%--
  Created by IntelliJ IDEA.
  User: MING
  Date: 2018/1/2
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>公共头信息</title>
    <link rel="stylesheet" href="../../../statics/css/header.css">
    <script src="http://malsup.github.io/jquery.form.js"></script>
</head>
<body>

<script type="text/javascript">
    $(function () {
        var headername=$('#header-name')
        var username="${username}";

        if(username!=""){
            headername.text(username);
            headername.append('<span class="caret"></span>');
        }else{
            headername.text("用户操作");
            headername.append('<span class="caret"></span>');
        }
    })
</script>



<div id="nav-box">
    <nav class="navbar navbar-default">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="home.jsp"><img src="../../../statics/img/szu.jpg" id="nav-brand-img"> </a>
            </div>


            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="home.jsp">首页 <span class="sr-only">(current)</span></a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">我的同乡会 <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="myTown.jsp">进入同乡会</a></li>
                            <li><a href="manTown.jsp">管理同乡会</a></li>
                            <li><a href="createTown.jsp">创建同乡会</a></li>
                        </ul>
                    </li>
                </ul>

                <form class="navbar-form navbar-left" method="post" action="search.jsp">
                    <div class="form-group">
                        <input type="text" class="form-control" id="hname" name="hname" placeholder="Search">
                    </div>
                    <button type="submit" class="btn btn-default">搜索</button>
                </form>

                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" id="header-name"> 123  <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="/toLog">登陆</a></li>
                            <li><a href="/toReg">注册</a></li>
                            <li><a href="userinfo.jsp">个人信息</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="logout.jsp">注销登陆</a></li>
                        </ul>
                    </li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
</div>
</body>
</html>




