<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<title>Customer Confirmation</title>
</head>
	<body>
	
	<h1>The customer is confirmed: ${customer.firstName} ${customer.lastName}</h1>
	
	<h1>Free passes: ${customer.freePasses}</h1>
	
	<h1>Postal Code: ${customer.postalCode}</h1>
	
	<h1>Course Code: ${customer.courseCode}</h1>
	
	</body>
</html>