<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.ArrayList, com.tier3.Customer"%>
<!DOCTYPE html>
<html>
<body>
<%
	ArrayList<Customer> list = (ArrayList<Customer>)request.getAttribute("list"); //String�� �ƴ϶�� ���� ǥ��
%>
<h1>Customer Data</h1>
<table border="1">
	<%for(Customer c : list){ %>
		<tr>
			<td><%= c.getNum() %></td>
			<td><%= c.getName() %></td>
		</tr>
	<%}%>
</table>
</body>
</html>