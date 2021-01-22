
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
    <title>회원정보목록</title>
</head>
<body>
<h1>회원정보목록</h1>
<table width="350px" border="1" cellspacing="0">
    <tr><th>아이디</th><th>회원등급</th><th>가입일</th></tr>
    <c:forEach var="mvo" items="${mvos}">
        <tr><th><a href="/memberview?userid=${mvo.userid}">${mvo.userid}</a></th>
            <th>${mvo.grade}</th>
            <th>${fn:substring(mvo.regdate,0 ,10 )}</th></tr>
    </c:forEach>
</table>
</body>
</html>
