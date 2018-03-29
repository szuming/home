<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>深大同乡会</title>
    <!-- 在bootstrap.min.js 之前引入 -->
    <script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>

    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <!--font-awesome CSS 文件-->
    <link rel="stylesheet" href="../font-awesome-4.7.0/css/font-awesome.min.css">

    <link rel="stylesheet" href="../css/home.css">

    <!--jquery.validate-->
    <script src="../js/jquery.validate.min.js" ></script>
    <script src="http://malsup.github.io/jquery.form.js"></script>
</head>
<body>


<div id="htown-body">
    <%@ include file="header.jsp" %>



    <div id="htowns-body" class="container">

        <div class="container">
            <div class="row">
                    <div class="col-md-3 htown-box">
                        <div class="thumbnail">
                            <img src="../img/szu.jpg" alt="..." class="htown-home-img">
                            <div class="caption">
                                <h2></h2>
                                <p>乡会人数：</p>
                                <p><a href="checkHtown.jsp?hid="  class="btn btn-default" role="button">查看信息</a> <a href="../../joinTown?hid=&hname=" class="btn btn-primary" role="button">申请加入</a></p>
                            </div>
                        </div>
                    </div>

            </div>
        </div>
    </div>
</div>



</body>
</html>
