<%--
  Created by IntelliJ IDEA.
  User: a7875
  Date: 2021-01-21
  Time: 오전 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>회원가입처리</title>
</head>
<body>
<h1>회원가입처리</h1>
<p>${result}</p>
<hr>
<p>아이디 : ${mvo.userid}</p>
<p>이름 : ${mvo.name}</p>
<p>비밀번호 :******</p>
<p>회원등급 : Bronze</p>
<p>회원마일리지 :1000</p>
</body>
</html>
