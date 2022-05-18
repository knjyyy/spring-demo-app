<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome customer</title>
</head>
<body>
	Hi ${customer.firstName} ${customer.lastName}
	<br><br>
	Free Passes: ${customer.freePasses}
	<br><br>
	Postal Code: ${customer.postalCode}
	<br><br>
	Course code: ${customer.courseCode}
</body>
</html>