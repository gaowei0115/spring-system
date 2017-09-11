<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>SPITTLE INFO</h1>
	<c:forEach items="${spittleList}" var="spittle">
		<li id="spittle_<c:out value="${spittle.id }"/>"/>
		<div>
			<c:out value="${spittle.message}"/>
		</div>
		<span>
			<c:out value="${spittle.time}"/>
		</span>
		<span>
			(<c:out value="${spittle.latitude}"/>
			 <c:out value="${spittle.longitude}"></c:out>
			)
			
		</span>
	</c:forEach>
</body>
</html>