<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My Page</title>
</head>
<body>



	<jsp:include page="/WEB-INF/views/mainTop_bar.jsp" />

<h1>MyPage</h1>
회원님 아이디: ${userset.id}
<br>
${loginRequest.id}
<br>
${loginInfo.id}

</body>
</html>