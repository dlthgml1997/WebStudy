<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>����� outer �����Դϴ�.</h1>
	<%-- ���þ�� include�ϴ� ��� : outer.jsp���� �ȿ� inner.jsp"���� ��ü ������ copy&paste ȿ��"
	inner.jsp ������ ������ ���� �ٲ�� outer.jsp�� ���뵵 ��� ����Ǿ�� ��(inner�� "�ٲ� �� �ٽ� ����") --%>
	<%@ include file="inner.jsp" %>
	<h1>���⵵ outer �����Դϴ�.</h1>
	<%@ include file="inner.jsp" %>
	
	<%-- action ���ҷ� include �ϴ� ���: �޼ҵ� ȣ��� ���. 
	"include ������ ������ ����" inner2.jsp ������ ������ �����ٰ� outer.jsp���� �ȿ� ���Խ��� ���. inner.jsp ������ ������ ���� �ٲ�
	outer.jsp�� ������ ������� ���� --%>
	<jsp:include page="inner2.jsp"></jsp:include>
</body>
</html>