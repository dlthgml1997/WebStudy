<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page isErrorPage="true" %>
<%-- isErrorPage�� ���� ó�� ���������� �� ������ϴ� �Ӽ�. �������ִٸ� �⺻ false�� �Ǿ����� --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>���� �߻�</h1>
	message: <%= exception.getClass().getName() %>
</body>
</html>