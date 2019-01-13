<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Users</title>
	
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
    <link rel="stylesheet"	
 	      href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>Users</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
			<form:form action="getUsers" modelAttribute="user" method="GET">
			<form:hidden path="id" />
			<table>
				<tbody>
					<tr>
						<td><label class="input-label">Last Name:</label></td>
						<td><form:input path="lastName" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Search users" class="save" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				<c:forEach var="tempUsers" items="${users}">
				
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${tempUsers.id}" />
					</c:url>					

					<c:url var="deleteLink" value="/customer/delete">
						<c:param name="customerId" value="${tempUsers.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempUsers.firstName} </td>
						<td> ${tempUsers.lastName} </td>
						<td> ${tempUsers.email} </td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>

</html>









