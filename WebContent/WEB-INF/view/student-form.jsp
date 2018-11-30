<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processform" method="post" modelAttribute="student">
		<p>
			First Name:
			<form:input path="firstName" />
		</p>
		<p>
			Last Name:
			<form:input path="lastName" />
		</p>
		<p>
			Gender: Male
			<form:radiobutton path="gender" value="Male" />
			Female
			<form:radiobutton path="gender" value="Female" />
		</p>
		<p>
			Country:
			<form:select path="country">
				<form:options items="${student.countryOptions }" />
			</form:select>
		</p>
		<p>
			Operating System: Linux
			<form:checkbox path="os" value="Linux" />
			Windows
			<form:checkbox path="os" value="Windows" />
			Mac
			<form:checkbox path="os" value="mac" />
		</p>
		<p>
			<input type="submit" value="Submit" />
		</p>
	</form:form>
</body>
</html>