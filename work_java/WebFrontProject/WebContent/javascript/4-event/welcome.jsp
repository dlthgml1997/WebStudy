<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>welcome</h1>
<a href="p76_formtest.html">back</a><br>
<%
	//���� html�������� Ŭ���̾�Ʈ�� �Է��� ���� �޾ƿ���!!!!
	String num = request.getParameter("num"); //��ȣ�ȿ� "�̸�"
	String choice = request.getParameter("choice");
	String season= request.getParameter("season");
	
	//checkbox�� ��� --> check�� �����۸� �Ѿ��
	String[] hobby= request.getParameterValues("hobby"); //üũ�Ȱ� ���Ƽ�

	out.println("num:"+num+"<br>"); //�������� ��� - "\n"�ƴϰ� "<br>"
	out.println("choice:"+choice+"<br>"); //one/two/three
	out.println("season:"+season+"<br>");

	for(String ho: hobby){
		out.println("hobby:"+ho+"<br>");
	}
%>
</body>
</html>