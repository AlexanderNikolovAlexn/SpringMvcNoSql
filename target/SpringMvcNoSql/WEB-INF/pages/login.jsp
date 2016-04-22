<html>
	<head>
		<title>Login</title>
	</head>
	<body>
		<form name="login" action="${loginUrl}" method="POST">
			<table>
				<tbody>
					<tr>
						<td><label>Username</label></td>
						<td><input id="username" name="username" type="text"/></td>
					</tr>
					<tr>
						<td><label>Password</label></td>
						<td><input id="password" name="password" type="password" /></td>
					</tr>
					<tr style="text-align: right">
						<td></td>
						<td><input name="submit" type="submit" value="Login" /></td>
					</tr>
				</tbody>
			</table>
<%-- 			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> --%>
		</form>
	</body>
</html>