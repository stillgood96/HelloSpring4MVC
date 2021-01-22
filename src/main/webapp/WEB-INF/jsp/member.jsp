<%--
  Created by IntelliJ IDEA.
  User: a7875
  Date: 2021-01-21
  Time: 오전 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입하기</title>
</head>
<body>
<h1>회원가입하기</h1>
<form name="mbfrm" method="post" action="/memberok">
    <div>아이디 <input type="text" name="userid"></div>
    <div>이름 <input type="text" name="name"></div>
    <div>비밀번호 <input type="password" name="password"></div>
    <div><button type="submit">입력완료</button></div>
</form>
</body>
</html>
