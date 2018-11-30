<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- ${items} --%>
	<form:form action="cart/processcart" method="post"
		modelAttribute="items">
		<table border="1">
			<tr>
				<td>Id</td>
				<td>Name</td>
				<td>Price</td>
				<td>Quantity</td>
			</tr>
			<c:forEach var="item" items="${items }">
				<c:set var="id" value="${id+1}" scope="page" />
				<tr>
					<td>${id}</td>
					<td>
						<%-- <form:checkbox path="checkedIdList" value="${item.id }" /> --%>
					</td>
					<td>${item.name}</td>
					<td>${item.price}</td>
					<input type="hidden" name="price" value="${item.price }" />
					<td><input type="text" name="qty${item.id }"></td>
				</tr>
			</c:forEach>

			<tr>
				<td colspan="5"><input type="submit" name="addtocart"
					value="Add To Cart"> <input type="submit" name="checkout"
					value="checkout"></td>
			</tr>

		</table>
	</form:form>
</body>
</html>