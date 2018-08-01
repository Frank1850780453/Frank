<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="${pageContext.request.contextPath }/playStar/edit.action" method="post">
		<input type="hidden" name="id" value="${playStarList.id }" />
		姓名：<input type="text" name="name" value="${playStarList.name }" ><br/>
		秒薪：<input type="text" name="money" value="${playStarList.money }" /><br>
		<input type="submit" value="编辑" >
			
	</form>
</body>
</html>