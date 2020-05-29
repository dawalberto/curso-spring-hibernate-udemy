<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<title>Customer Registration Form</title>
	<style>
		.error {
			color: red;
		}
	</style>
</head>
	<body>
	
	<form:form action="processForm" modelAttribute="customer">
	
		<p>FirstName: <form:input path="firstName" /></p>
		<p>
			Last name (*): <form:input path="lastName" />
			<form:errors path="lastName" cssClass="error" />
		</p>
		
		<p>
			Free Passes (*): <form:input path="freePasses" />
			<form:errors path="freePasses" cssClass="error" />
		</p>
		
		<input type="submit" value="Submit" />
	
	</form:form>
	
	</body>
</html>