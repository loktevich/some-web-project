<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="locale"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<c:url var="cssUrl" value="/css/main.css" />
<link rel="stylesheet" href="${cssUrl}" />

<c:url var="jsUrl" value="/js/main.js" />
<script src="${jsUrl}"></script>

<title>Insert title here</title>
</head>
<body>
	<div class="" style="height: 100px; background-color: #abb231;"></div>
	<jsp:doBody />
</body>
</html>