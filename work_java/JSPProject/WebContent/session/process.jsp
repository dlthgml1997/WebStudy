<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- 
1.login.jsp���� �Ѿ�� �Ķ���� �ޱ�
2.�޾ƿ� ���� ���ǿ� �����ϱ�
3.��ũ������ check.jsp�� �Ѿ��
--%>
<%
	request.setCharacterEncoding("EUC-KR");//�ѱ۾ȱ����� �ޱ�
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	
	//���ǿ� �����ϱ�
	session.setAttribute("id", id);
	session.setAttribute("pass", pass);
	
	ArrayList<String> list = new ArrayList<>();
	list.add("red");
	list.add("green");
	list.add("blue");
	list.add("yellow");
	list.add("cyan");
	list.add("magenta");
	
	session.setAttribute("list",list); //��ü ����
%>
<a href="check.jsp">check.jsp</a>
</body>
</html>