<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<title>Student Confirmation</title>
</head>
	<body>
		<p>The student is confirmed: ${student.firstName} ${student.lastName}</p>
		<p>Country: ${student.country}</p>
		<p>Favorite Language: ${student.favoriteLanguage}</p>
		<p>Operating Systems:</p>
		<ul>
			<c:forEach var="os" items="${student.operatingSystems}">
				<li>${os}</li>
			</c:forEach>
		</ul>
	</body>
</html>