

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
		<form:form action="save_producto" method="post" modelAttribute="producto">
			<table border="0" >
							<tr>
									
					<td>nombre: </td>
					<td><form:input path="nombre" ></form:input></td>
				</tr>
				<tr>
					<td>precio: </td>
					<td><form:input  path="precio" /></td>
				</tr>
				<tr>
					<td>Marca: </td>
					<td><form:input path="carca" /></td>
				</tr>	
				<tr>
					<td>Catalogo: </td>
					<td><form:input path="catalogo" /></td>
				</tr>	
				<tr>
					<td>descripcion: </td>
					<td><form:input path="descripcion" /></td>
				</tr>	
				<tr>
					<td>existencia: </td>
					<td><form:input path="existencia" /></td>
				</tr>		
				<tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</tr>
		
										
			</table>
		</form:form>
	</div>
</body>
</html>