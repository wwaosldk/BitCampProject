<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="naverCss.css"/>
<title>Insert title here</title>
</head>
<body>
<%session.invalidate();%>
<jsp:include page="/WEB-INF/views/mainTop_bar.jsp" />
안전하게 로그아웃 되었습니다.
<a href="/op">메인페이지로 돌아가기</a>
</body>
</html>