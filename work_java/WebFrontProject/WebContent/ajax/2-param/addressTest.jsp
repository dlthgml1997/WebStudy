<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%
String name = request.getParameter("name").trim();		

String address = null;
if(name.equals("tommy")){
	address = "seoul";	
}
//tommy�̸� ����, �������� ��
if( address != null){
	out.println(address);
}else{	
	out.println("no data...");
}

%>