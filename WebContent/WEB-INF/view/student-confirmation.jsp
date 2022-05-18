<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	Welcome! 
	<br>
	First Name: ${student.firstName} 
	<br>
	Last Name: ${student.lastName} 
	<br>
	Country: ${student.country }
	<br>
	Favorite Language: ${student.favoriteLanguage}
	<br>
	OS: 
	<ul>
		<c:forEach var="os" items="${student.osUsed}">
			<li>${os}</li>
		</c:forEach>
	</ul>
</body>
</html>