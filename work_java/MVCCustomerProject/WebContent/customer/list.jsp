<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%-- import="java.util.ArrayList, com.dao.Customer"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--�ʱ�ȭ�� --%>
<html>
<body><center>   
<%--
	ArrayList<Customer> list = (ArrayList<Customer>)request.getAttribute("list");	
--%>
<h1>Customer Data</h1>
<%@ include file="loginCheck.jsp" %>
<table border="1">
	<%-- for(Customer c: list){ %>
		<tr>
			<td><%= c.getNum() %></td>
			<td><a href="read.cus?num=<%= c.getNum() %>"><%= c.getName() %></a></td><!-- ��ȣ������ ������ read�� �������� -->
		</tr>
	<%} --%>
	<c:forEach items="${list }" var="c"> <%-- request>session>application������� �����鼭 list�� �˾Ƽ� ã�´� --%>
		<tr>
			<td>${c.num }</td>
			<td><a href="read.cus?num=${c.num }">${c.name }</a></td> <%-- read.cus�� num�� Parameter�� ����!! --%>
		</tr>	
	</c:forEach>
</table>
<a href="insert.cus">�������</a>
</body>
</html>
