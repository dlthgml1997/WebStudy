<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${empty id }">
	<a href="main.do?action=loginForm">�α���</a><br>
</c:if>

<c:if test="${!empty id }">
	welcome, ${id }!
	<a href="main.do?action=logout">�α׾ƿ�</a><br>
</c:if>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>