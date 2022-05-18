<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student form</title>
</head>
<body>
	<h4>Student Form</h4>
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName" />
		<br>
		<br>
		Last Name: <form:input path="lastName" />
		<br>
		<br>
		<form:select path="country">
			<form:options items="${countryOptions}" />
		</form:select>
		<br>
		<br>
		<form:radiobuttons path="favoriteLanguage" items="${student.programmingLanguages}"/>
		<br>
		<br>
		Windows <form:checkbox path="osUsed" value="windows"/>
		Linux <form:checkbox path="osUsed" value="linux" />
		Mac <form:checkbox path="osUsed" value="mac" />
		<br>
		<br>
		<input type="submit">
	</form:form>
</body>
</html>