<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" errorPage="../basic/error.jsp"%>
<!DOCTYPE html>
<html>
<body>
<%-- html���� ���۵� �� �޾ƿͼ� ȭ�鿡 ��� --%>
<%
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	String code = request.getParameter("code"); 
	int cnum = Integer.parseInt(code); //code�� ���ڿ��̶�� parseInt�� �Ұ����ؼ� 500��(��������)�� �߻�
	cnum++;	
%>
	ID: <%= id %><br>
	PASS: <%= pass %><br>
	CODE: <%= cnum %><br>
	<hr>
	<a href="login.html">back</a>
</body>
</html>