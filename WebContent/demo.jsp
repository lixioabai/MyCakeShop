<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>



<c:forEach items="${hotList}" var="g">

${pageContext.request.contextPath} ${g.cover}
<a href="${pageContext.request.contextPath} ${g.cover}">
		
							 
	<img src="${pageContext.request.contextPath}${g.cover}" class="img-responsive" alt="${g.name}" width="350" height="350"/>
	</a>

</c:forEach>
</body>
</html>