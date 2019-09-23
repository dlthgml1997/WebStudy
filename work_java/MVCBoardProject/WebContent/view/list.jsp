<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){ //���� �̸����⸦ ajax�� ������ ��
		$('.title').mouseover(function(){ //'tr'�̸� �࿡ ���콺 �ø� ��� '.title'�̸� ���� ���콺 �ø� ���
			var number = $(this).attr('id'); //���콺�� �ö� �� span�� id�Ӽ��� ��(=�۹�ȣ)�� �˾ƿ�!
			//alert(number);
			//ajax��û ������
			$.ajax({//"json��������" ajax��ſ� �ʿ��� ���� ����� ��� ��
				url:'read2.bod', //serer �ּ�
				data:{
					num: number //������ ���� ������(�۹�ȣ number, , ..)
				},
				success: function(result, status, xhr){ //�����κ��� ������ ������ �������̸�
														//	(�������� ������ ���������� �������� ��) �۵��� �Լ� -> Callback method
					$('#display').html('<h3>'+result+'</h3>');//div�� ǥ���Ҷ� html()���!! �ƴҰ�� val() 
																//result�� ���������� �޾ƿ� ������
					$('#display').css('visibility','visible');
				}
			});			
		});
	});
</script>
</head>
<body>
<center>
		<h1>JSP �Խ���</h1>			
		<form method="post" action="search.bod">
			<select name="condition">
				<option value="name">�۾���</option>
				<option value="title">��  ��</option>
			</select>
			<input type="text" name="word">
			<input type="submit" value="�˻�">
		</form>
		
		<div id="display" style="visibility:hidden;"><h3>aaa</h3></div> <%-- visibility�� �ؼ� �ڸ������� �ϰ��ִ�(display�� ������ ����) --%>
		
		<TABLE BORDER=1 CELLSPACING=1 CELLPADDING = 1><TR>
		<th width=100 bgcolor=#113366><font color=#ffffee size=2>��ȣ</th>
		<th width=200 bgcolor=#113366><font color=#ffffee size=2>����</th>
		<th width=100 bgcolor=#113366><font color=#ffffee size=2>�۾���</th>
		<th width=150 bgcolor=#113366><font color=#ffffee size=2>��¥</th>
		<th width=100 bgcolor=#113366><font color=#ffffee size=2>��ȸ��</th>

		<c:forEach items="${list }" var="c">
	    <tr bgcolor=pink>
		  <td align=center bgcolor=pink>&nbsp;<font size=2>${c.num }</td>
	       
	      <td align=center bgcolor=pink>&nbsp;<font size=2>
			<span id="${c.num }" class="title"> <%-- ajax�� --%>
	      		<a href="read.bod?num=${c.num }">${c.title }</a>
	       	</span>	     
	      </td>
	      <td align=center bgcolor=pink>&nbsp;<font size=2>${c.name }</td>
	       
	      <td align=center bgcolor=pink>&nbsp;<font size=2>${c.wdate }</td>
	       
	      <td align=center bgcolor=pink>&nbsp;<font size=2>${c.count }</td>	       
	    </tr>
	   </c:forEach>
</table>
<br></br>
<a href=insertForm.bod>���۾���</a>
</body></html>