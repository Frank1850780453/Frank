<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form>
	<table>
		<tr>
			<td>
				<a href="${pageContext.request.contextPath }/add.jsp">添加</a>&nbsp;
				<a href="javascript:void(0)" onclick="batchDel()">批量删除</a>
			</td>
		</tr>
			<tr>
				<td>编号</td>
				<td>姓名</td>
				<td>秒薪</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${list }" var="p">
			
				<tr>
					<td>${p.id }</td>
					<td>${p.name }</td>
					<td>${p.money }</td>
						<td width="10%" align="center">
						<a href="${pageContext.request.contextPath }/playStar/getById.action?id=${p.id }">编辑</a>&nbsp;&nbsp;&nbsp;
						<a href="${pageContext.request.contextPath }/playStar/deleteById.action?id=${p.id }">删除</a>
					</td>
				</tr>
			
			</c:forEach>
		</table>
	</form>
</body>
</html>