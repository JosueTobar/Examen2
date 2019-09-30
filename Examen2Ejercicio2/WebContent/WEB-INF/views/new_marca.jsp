<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New MArca</title>
</head>
<body>
	<div align="center">
		<h2>New Customer</h2>
		<form:form action="save_marca" method="post" modelAttribute="marca">
			<table border="0" cellpadding="5">
				<tr>
					<td>Name: </td>
					<td><form:input path="nombre" /></td>
				</tr>
		
				<tr>
					<td colspan="2"><input type="submit" value="save_marca"></td>
				</tr>						
			</table>
		</form:form>
	</div>
</body>
</html>