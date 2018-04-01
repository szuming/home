<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册账号</title>
    <!-- 在bootstrap.min.js 之前引入 -->
    <script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <!--font-awesome CSS 文件-->
    <link rel="stylesheet" href="../../../statics/font-awesome-4.7.0/css/font-awesome.min.css">
    <!--jquery.validate-->
    <script src="../../../statics/js/jquery.validate.min.js" ></script>
    <script src="http://malsup.github.io/jquery.form.js"></script>

    <link rel="stylesheet" href="../../../statics/css/reglog.css">
    <script src="../../../statics/js/reglog.js"></script>
</head>
<body>
<!--检验是否登陆，已登录则提示其注销-->
<%/*
    Object o=session.getAttribute("userName");
    if(o!=null){
        //写提示
        tips tip=new tips();
        tip.setFlag(1);
        tip.setTip("您已经登录，请注销后再注册");
        session.setAttribute("tip",tip);
        response.sendRedirect("./home.jsp");
        return;
    }*/
%>
<div class="form row" id="register-page">
    <form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="reg_form" action="reg" method="post">
        <h3 class="form-login-title">注册账号</h3>
        <div class="col-sm-9 col-md-9">
            <div class="form-group">
                <i class="fa fa-user fa-lg"></i>
                <input class="form-control required" type="text" placeholder="用户名" name="username" autofocus="autofocus"/>
            </div>
            <div class="form-group">
                <i class="fa fa-lock fa-lg"></i>
                <input class="form-control required" type="password" placeholder="密码" id="register_password" name="password"/>
            </div>
            <div class="form-group">
                <i class="fa fa-check fa-lg"></i>
                <input class="form-control required" type="password" placeholder="再次输入密码" name="rpassword"/>
            </div>
            <div class="form-group">
                <i class="fa fa-user fa-lg"></i>
                <input class="form-control required" type="text" placeholder="手机号码" name="userphone" autofocus="autofocus"/>
            </div>
            <input type="hidden" name="identify" value="reg"/>
            <div class="form-group">
                <input type="submit" class="btn btn-success pull-right" value="注册"/>
                <a href="home.jsp" id="register_btn">返回主页面</a>
            </div>
        </div>
    </form>
</div>
</body>
</html>
