<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processlogin" method="post" modelAttribute="user">
		<p>
			Username:
			<form:input path="username" required="required" />
			<form:errors path="username" />
		</p>
		<p>
			Password:
			<form:password path="password" required="required" />
			<form:errors path="password" />
		</p>
		<input type="submit" value="Login">
	</form:form>
</body>
</html>