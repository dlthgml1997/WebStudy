<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="process.jsp" method="post">
		���̵�:<input type="text" name="id"><br>
		�н�����:<input type="password" name="pass"><br>
		<input type="submit" value="����">
		<input type="reset" value="���">	
	</form>
</body>
</html>