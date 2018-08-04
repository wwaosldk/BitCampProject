<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/mainTop_bar.jsp" />
	<h3>회원가입</h3>
		 <hr>		
		<c:if test="${insertCnt > 0}">
		<h4>회원가입 성공 !</h4>
		<hr>
		<h4>${userset.id} 님 환영합니다.</h4>
		
		<a href="naverLogin">로그인 하러가기</a>
		</c:if>
		<c:if test="${!(insertCnt > 0)}">
		<h4>회원가입 실패 !</h4>
		<a href="user/naverRegi">회원가입 다시 하러가기</a>
		</c:if>



		
</body>
</html>