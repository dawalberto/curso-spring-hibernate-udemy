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
			
			<p>Favorite Language:</p>
			<label>
				Java
				<form:radiobutton path="favoriteLanguage" value="Java"></form:radiobutton>
			</label>
			<label>
				JavaScript
				<form:radiobutton path="favoriteLanguage" value="JavaScript"></form:radiobutton>
			</label>
			<label>
				C#
				<form:radiobutton path="favoriteLanguage" value="C#"></form:radiobutton>
			</label>
			<label>
				Python
				<form:radiobutton path="favoriteLanguage" value="Python"></form:radiobutton>
			</label>
			
			<p>Operating Systems:</p>
			<label>
				Linux
				<form:checkbox path="operatingSystems" value="Linux"></form:checkbox>
			</label>
			<label>
				Mac OS
				<form:checkbox path="operatingSystems" value="Mac OS"></form:checkbox>
			</label>
			<label>
				MS Windows
				<form:checkbox path="operatingSystems" value="MS Windows"></form:checkbox>
			</label>
			
			<br />
			<input type="submit" value="Submit" />
				
		</form:form>
	
	</body>
</html>