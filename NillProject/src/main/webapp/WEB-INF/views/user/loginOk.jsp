<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 확인</title>
</head>
<body>
	<jsp:include page="/WEB-INF/views/mainTop_bar.jsp" />
		<c:if test="${loginInfo ne null}">
		<h3>로그인 성공 !</h3>
		<hr>
		<h4> ${userid} 님 환영합니다.</h4>
		<h5>모델처리로... ${userid}</h5>
		<h5>request에서 ${loginRequest.id}</h5>
		<a href="#">마이페이지 보러가기</a>
		<br>
		<a href="/op">메인페이지</a>
		</c:if>
		<c:if test="${loginInfo eq null}">
		<h4>회원가입 실패 !</h4>
		<a href="/op/user/naverLogin">로그인 다시 하러가기</a>
		</c:if> 
</body>
</html>