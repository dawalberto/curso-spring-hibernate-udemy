<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<title>Student Form</title>
</head>
	<body>
	
		<form:form action="processForm" modelAttribute="student">
			<p>First name: <form:input path="firstName"/></p>			
			<p>Last name: <form:input path="lastName"/></p>
			
			<form:select path="country">
				<form:options items="${student.countryOptions}" />
			</form:select>
			<input type="submit" value="Submit" />			
		</form:form>
	
	</body>
</html>