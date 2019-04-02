<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 2019/4/2
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <base href="<%=request.getContextPath()+'/'%>">
    <title>用户登录</title>
    <script type="text/javascript" src="application/jquery/1.9.1/jquery.min.js"></script>
    <script type="text/javascript">
        $(function(){
            alert(1);
            $("#login").click(function(){
                $(".role").each(function () {
                    if(this.val()=="student"){
                        $("form").prop("action","student/login");
                    }
                    if(this.val()=="teacher"){
                        $("form").prop("action","teacher/login");
                    }
                });
            });
        });
    </script>
</head>
<body>
    <form method="post" action="" onsubmit="sub()">
        用户名称：<input type="text" name="name"><br>
        用户密码：<input type="text" name="password"><br>
        <input type="checkbox" class="role" value="student">学生
        <input type="checkbox" class="role" value="teacher">老师
        <input type="submit" id="login" value="登录">
    </form>
</body>
</html>
