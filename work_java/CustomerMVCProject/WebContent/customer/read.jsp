<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="com.dao.Customer"%>

<html>
<body><center>   
<%
	Customer c = (Customer)request.getAttribute("c");	
%>
<h1>Customer Detail Data</h1>
<table border="1">
	<tr>
		<td><%= c.getNum() %></td>
		<td><%= c.getName() %></td>
		<td><%= c.getAddress() %></td>
	</tr>
</table>
<br>
<a href="list.cus">�ʱ�ȭ��</a>&nbsp;&nbsp;&nbsp;
<a href="delete.cus?num=<%= c.getNum() %>">�����ϱ�</a>
</body>
</html>
