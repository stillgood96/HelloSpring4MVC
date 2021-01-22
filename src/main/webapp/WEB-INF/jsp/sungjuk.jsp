<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>성적처리프로그램 v13</title>
</head>
<body>
<header>
    <h1>성적처리프로그램</h1>
</header>

<!--db테이블명과 동일하게 적용해야 헷갈리지 않는다잉 ~  -->
<form nam="sjfrm" method="post" action="/sungjukok">
    <div>이름 : <input type="text" name="name"></div>
    <div>국어 : <input type="text" name="kor"></div>
    <div>영어 : <input type="text" name="eng"></div>
    <div>수학 : <input type="text" name="mat"></div>
    <div><button type="submit">입력완료</button>
        <button type="submit">다시입력</button></div>
</form>



</body>
</html>
