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
	<br>
	Free Passes: ${customer.freePasses}
	<br>
	Postal Code: ${customer.postalCode}
</body>
</html>