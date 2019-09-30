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
	<h3><a href="new_producto">Nueva Procducto</a></h3>
<table border="1" >
		<tr>
			<th>ID</th>
			<th>nombre</th>
			<th>precio</th>
			<th>Marca</th>
			<th>Catalogo</th>
			<th>descripcion</th>
			<th>existencia</th>
			<th>Acciones</th>
		</tr>
		<c:forEach items="${listProductos}" var="producto">
		<tr>
			<td>${producto.id}</td>
			<td>${producto.nombre}</td>
			<td>${producto.precio}</td>
			<td>${producto.idMarca}</td>
			<td>${producto.idCatalogo}</td>
			<td>${producto.descripcion}</td>
			<td>${producto.existencia}</td>
		
			<td>
				<a href="edit_producto?id=${producto.id}">Edit</a>
				&nbsp;&nbsp;&nbsp;
				<a href="delete_producto?id=${producto.id}">Delete</a>
			</td>
		</tr>
		</c:forEach>
	</table>
		
		</div>
</body>
</html>