<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Login</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">
	<link rel="stylesheet"	
	  	  href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>Login</h2>
		</div>
	</div>

	<div id="container">
	
		<form:form action="loginUser" modelAttribute="user" method="POST">

			<form:hidden path="id" />
			<table>
				<tbody>
					<tr>
						<td><label class="input-label">Username:</label></td>
						<td><form:input path="username" /></td>
					</tr>
					<tr>
						<td><label class="input-label">Password:</label></td>
						<td><form:input path="password" /></td>
					</tr>
					<tr>
						<td><label class="apply-button"></label></td>
						<td><input type="submit" value="Login" class="save" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>
		<div style="clear; both;"></div>
	</div>
</body>
</html>










