<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${not empty id }">
ȯ���մϴ�, ${id }��!
<a href="logout.cus">�α׾ƿ�</a><br>
</c:if>

<c:if test="${empty id }">
<a href="login.cus">�α���</a><br>
</c:if>
</body>
</html>