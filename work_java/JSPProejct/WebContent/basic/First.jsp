<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!--  html �ּ�(�ҽ��� ���� ->������ ���� ���ɼ��� ����!!) -->
	<%-- jsp �ּ�(�ҽ��� �߰����� �ʴ´�. ->��� ��õ) --%>
	<h1>hello, jsp</h1>
	<% 
		//�ڹ� �ڵ�
		int num=99;
		if(num>100)
			out.println("big number");
		else
			out.println("small number");
	%>
</body>
</html>