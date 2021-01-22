<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>성적처리 수정  v13</title>
</head>
<body>
<header>
    <h1>성적처리프로그램</h1>
</header>

<!--db테이블명과 동일하게 적용해야 헷갈리지 않는다잉 ~  -->
<form name="sjfrm" method="post" action="/sungjukupdok">
    <div>이름 : <input type="text" name="name" value="${sj.name}" readonly></div>
    <div>국어 : <input type="text" name="kor"value="${sj.kor}"></div>
    <div>영어 : <input type="text" name="eng"value="${sj.eng}"></div>
    <div>수학 : <input type="text" name="mat"value="${sj.mat}"></div>
    <input type="hidden" name="sjno" value="${sj.sjno}">
    <div><button type="submit">수정완료</button></div>
</form>



</body>
</html>
