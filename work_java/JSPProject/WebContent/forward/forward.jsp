<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- ���� ȭ�鿡�� �Ѿ�� �Ķ���� ���� ���� welcome.jsp�� login.html�� forward ��Ŵ --%>
<%
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	
	if(id.equals("tommy") && pass.equals("123")){ //���� ��
%>
	<jsp:forward page="welcome.jsp">
		<jsp:param value="<%= id %>" name="id" />
		<jsp:param value="<%= pass %>" name="pass" />
	</jsp:forward>
<%	}else{ %> 
	<jsp:forward page="login.html"/>
<%	}%>
</body>
</html>