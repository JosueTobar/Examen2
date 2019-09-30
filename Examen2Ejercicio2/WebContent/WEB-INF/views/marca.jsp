<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mantenimiento</title>
</head>
<body>
	<div align="center">
	<h3><a href="new_marca">Nueva Marca</a></h3>
<table border="1" >
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Acciones</th>
		</tr>
		<c:forEach items="${listMarca}" var="marca">
		<tr>
			<td>${marca.id}</td>
			<td>${marca.nombre}</td>
		
			<td>
				<a href="edit_marca?id=${marca.id}">Edit</a>
				&nbsp;&nbsp;&nbsp;
				<a href="delete_marca?id=${marca.id}">Delete</a>
			</td>
		</tr>
		</c:forEach>
	</table>
		
		</div>
</body>
</html>