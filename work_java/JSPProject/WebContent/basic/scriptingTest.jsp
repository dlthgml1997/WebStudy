<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>scripting test</h1>
<%-- ����: jsp������ ��ȯ�Ǿ� ����� �ڹ� ������ "��� �ʵ�/�޼ҵ� ����" �� ��� --%>
<%!
	int big = 999;
	public String hello(String name){
		return "hello," + name;
	}
%>

<%-- ��: ������, ��� ���, �޼ҵ� ȣ�� ����� "���"�� �� ���. ;�� ������ ���� --%>
result: <%= big%><br>
result2: <%= hello("kim") %><br>
<hr>

<%-- ��ũ��Ʈ��: �ڹ��ڵ� ���� ���� --%>
<%
	if(big > 1000){
		out.println("level-1"); //out�� ���� ��ü
	}else{
%>
<%= "level-2" %>
<%	
	}
%>
</body>
</html>