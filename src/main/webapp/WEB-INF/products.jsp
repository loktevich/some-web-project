<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>Id</td>
				<td>Title</td>
				<td>Description</td>
				<td>Count</td>
				<td>Price</td>
				<td>Category Id</td>
				<td>Category title</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${products}" var="product">
				<tr>
					<td>${product.id}</td>
					<td>${product.title}</td>
					<td>${product.description}</td>
					<td>${product.count}</td>
					<td>${product.price}</td>
					<td>${product.productCategory.id}</td>
					<td>${product.productCategory.title}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>