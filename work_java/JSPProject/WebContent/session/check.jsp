<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>session���� �� ������</h1>
<%-- 
1.session�� ����� �� ������ ���
2.��ũ�ɾ delete.jsp�� �Ѿ�� 
--%>
<%
	String id = (String)session.getAttribute("id");
	String pass = (String)session.getAttribute("pass");
%>
�ȳ��ϼ���? <%= id %>��!<br>
�н������ <%= pass %>�Դϴ�.<br>
<h3>list ����</h3>
<%
	ArrayList<String> list = (ArrayList<String>)session.getAttribute("list");
	for(String color: list){%>
		<%= color %>		
<%	}%>
<hr>
${sessionScope.id }<br>
${sessionScope.pass }<br>
<a href="delete.jsp">delete.jsp</a>
</body>
</html>