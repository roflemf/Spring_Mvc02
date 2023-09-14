<%@ page contentType="text/html; charset=UTF-8" %>
<!-- 웹 브라우저에 출력되는 문자, 태그, 언어 코딩 타입 설정해야 HTML 태그, 자바스크립트 등이 잘 적용되고, 한글이 안깨지게 잘 출력됌-->
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<%-- EL(표현언어)에서 사용한 serverTime은 HomeController.java에서 설정한 키이름.
	이 이름 참조하여 시간/날짜 포맷값 가져옴 --%>
</body>
</html>
