<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="com.dao.CustomerDAO"%>
<!DOCTYPE html>
<html>
<body>
<%--
	Customer c = (Customer)request.getAttribute("c");	
--%>
<h1>��ϵ� ������</h1>
<table border="1">
		<tr>
			<td>${c.num }</td>
			<td>${c.name }</td>
			<td>${c.address }</td>
		</tr>
</table>
<br>
<a href="main.do">�ʱ�ȭ��</a>
</body>
</html>