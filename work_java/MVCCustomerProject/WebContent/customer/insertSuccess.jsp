<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="com.dao.Customer"%>
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
<a href="list.cus">�ʱ�ȭ��</a>
</body>
</html>