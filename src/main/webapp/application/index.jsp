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
    <base href="<%=request.getContextPath()+"/"%>">
    <title>Title</title>
    <script type="text/javascript" src="/application/jquery/1.9.1/jquery.js"></script>
    <script type="text/javascript">
        $(function () {
            alert(1);

        });
    </script>
</head>
<body>
    <c:if test="${user.type ==2}">
        <a href="student/student_list">学生管理</a>
    </c:if>

    <c:if test="${user.type==1}">
        <a href="student/student_list">学生管理</a>
        <a href="class/class_list">班级管理</a>
        <a href="teacher/teacher_list">老师管理</a>
    </c:if>
</body>
</html>
