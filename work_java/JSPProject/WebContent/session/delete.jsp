<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>session �� ����</h1>
<%--
1.���ǿ� ����Ǿ� �ִ� �� ����
2.��ũ�ɾ� login.jsp, check.jsp�� �Ѿ��
--%>
<%
	session.setAttribute("id", null);
	session.setAttribute("pass", null);
%>
<a href="login.jsp">login.jsp</a>
<a href="check.jsp">check.jsp</a>
</body>
</html>