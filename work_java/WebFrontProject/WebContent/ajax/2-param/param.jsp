<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
//java code ���� ��
	//client�� ������ ������ �ޱ�
	//�ּ�â�� ?name=����&address=���� �� �����͸� ���� �־� Ȯ���Ѵ�. (?�� &��� ������ ����)
	String name = request.getParameter("name"); //�̸����� �����͸� �޾ƿ´�
	String address = request.getParameter("address");
	out.println("hello... "+name+"<br>"); //Ŭ���̾�Ʈ�� ������
	out.println("you live in "+address+"<br>");
	




%>