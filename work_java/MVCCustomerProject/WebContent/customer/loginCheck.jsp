<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%--
	String id = (String)session.getAttribute("id");
	if(id != null){ %>
		<%=id %>��, ȯ���մϴ�. 
		<a href="logout.cus">�α׾ƿ�</a><br>
<% 	}else{%>
		<a href="login.cus">�α���</a><br>
<% 	} --%>
<c:if test="${not empty id }">
ȯ���մϴ�, ${id }��!
<a href="logout.cus">�α׾ƿ�</a><br>
</c:if>

<c:if test="${empty id }">
<a href="login.cus">�α���</a><br>
</c:if>
</body>
</html>