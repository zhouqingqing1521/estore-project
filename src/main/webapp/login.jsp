<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>briup电子商务-登录页</title>
    <link rel="stylesheet" href="css/common.css"/>
    <link rel="stylesheet" href="css/style.css" />
</head>
<body>
<div class="header1">
    <a href="#">
        <img src="images/logo.png">
    </a>
</div>
<div class="content1">	<!--背景颜色-->
    <div class="c1_box1"><!--背景图片-->
        <div class="login_box"><!--登陆框-->
            <div class="center1">
                <form action="/estore/loginServlet" method="post">
                    <h1>账号登陆</h1>
                    <c:choose>
                        <c:when test="${!empty error}">
                            <h2 style="color: red">${error}</h2>
                        </c:when>
                        <c:otherwise>
                            <h2>公共场所请不要泄露您的密码，以防止账号丢失</h2>
                        </c:otherwise>
                    </c:choose>
                    <c:remove var="error" scope="session"></c:remove>
                    <div class="si_box">
                        <span class="usr_icon"></span>
                        <input type="text" name="name"/>
                    </div>
                    <!--分割条-->
                    <div class="c10"></div>
                    <div class="si_box">
                        <span class="pwd_icon"></span>
                        <input type="password" name="password"/>
                    </div>
                    <div class="fg_box">
                        <a class="treg" href="#">立即注册</a>
                    </div>
                    <div class="sub_box">
                        <input type="submit" value="登陆"/>
                    </div>
                </form>
                <div>
                    请使用合作网站账号登陆杰普电子商务网：
                </div>
                <div class="com_box">
                    <span class="tencent"></span>

                </div>
            </div>
        </div>
    </div>
</div>
<div class="footer1">
    <div class="links">
        <a href="#">关于我们</a>|
        <a href="#">联系我们</a>|
        <a href="#">友情链接</a>|
        <a href="#">关于我们</a>|
        <a href="#">联系我们</a>|
        <a href="#">友情链接</a>
    </div>
    <div>
        沪ICP备1928832 杰普软件briup.com版权所有。
    </div>

    <img src="images/police.png">

</div>
</body>
</html>
