<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>�����Ұ������Է�</h1>
	<form action="main.do?action=updateProcess" method="post">
		<input type="text" name="num" value="${c.num }" readonly="readonly"><br>
		<input type="text" name="name" value="${c.name }" readonly="readonly"><br>
		�ּ�:<input type="text" name="address"><br>
		<!-- input type="hidden" name="num" value="${num }" --> <!-- hidden���� ���ܼ� �Ķ���� ���� -->
		<input type="submit" value="����">
		<input type="reset" value="���">
	</form>
</body>
</html>