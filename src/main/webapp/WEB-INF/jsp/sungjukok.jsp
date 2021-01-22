<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/functions" prefix="fng"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>성적처리결과</title>
</head>
<body>
<h1>성적처리결과</h1>
<p>${result}</p>
<p>이름 : ${sj.name}</p>
<p>국어 : ${sj.kor}</p>
<p>영어 : ${sj.eng}</p>
<p>수학 : ${sj.mat}</p>
<p>총점 : ${sj.tot}</p>
<p>평균 : ${fn:substring(sj.mean,0,4) },
                <fmt:formatNumber value="${sj.mean}" pattern=".0"/> </p>
<p>등급 : ${sj.grd}</p>
</body>
</html>
