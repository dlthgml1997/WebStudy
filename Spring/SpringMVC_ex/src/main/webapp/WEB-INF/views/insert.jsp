<%@ page contentType="text/html; charset=euc-kr"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<center>
<h1>
	Add New Customer Data 
</h1>
<!-- form: Ŭ���̾�Ʈ�� �Է��� ���� ������ �����ϱ� ���� �±� -->
<form action="insert.mvc" method="post">
	num: <input type="text" name="num"><br>
	name: <input type="text" name="name"><br>
	address: <input type="text" name="address"><br>
	
	<input type="submit" value="add data">
	<input type="reset" value="cancel">
</form>



</center>
</body>
</html>






