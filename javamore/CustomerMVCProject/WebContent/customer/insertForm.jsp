<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<body>
		<h1>�������</h1>
		<form action="insertProcess.cus" method="post" id="f">
			<hr>
			NUM : <input type="text" name="num" id="num">
			<br>
			NAME : <input type="text" name="name" id="name">
			<br>
			ADDRESS : <input type="text" name="address" id="address">
			<hr>
			<a href="insertProcess.cus?num=">
				<input type="submit" value="����">
			</a>
			<input type="reset" value="���">
		</form>
	</body>
</html>