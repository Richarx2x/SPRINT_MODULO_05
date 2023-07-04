<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Sistema de Capacitacion 2.0 - Listados</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>

	<div class="container">
		<h1>Listado de Usuarios</h1>
		<div>
		<!-- <a href="${pageContext.request.contextPath}/actor?op=new">Crear Actor/Actriz</a>  -->	
		</div>
		
		<table>  <!--  class="table" id="table_actors"  -->
			<thead > <!--  class="table-dark" -->
				<tr>
					<th>Id</th>
					<th>Nombre</th>
					<th>Nombre de usuario</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="u" items="${usuarios}">
					<tr>
						<td>
							<c:out value="${u.getId()}"></c:out>
						</td>
						<td><c:out value="${u.getNombre()}"></c:out></td>
						<td><c:out value="${u.getUsername()}"></c:out></td>
						<td>
					
					<!--	<a href="${pageContext.request.contextPath}/actor?id=${a.getActorId()}&op=read"><i class="fa-solid fa-eye"></i></a>
						<a href="${pageContext.request.contextPath}/actor?id=${a.getActorId()}&op=edit"><i class="fa-solid fa-pen-to-square"></i></a>
						<a href="${pageContext.request.contextPath}/actor?id=${a.getActorId()}&op=delete"><i class="fa-solid fa-trash"></i></a>
						<a href="${pageContext.request.contextPath}/films?actorId=${a.getActorId()}"><i class="fa-solid fa-film"></i></a> -->
						
						</td>
					</tr> 
				</c:forEach>
				
			</tbody>
		</table>
		
		 <a href="${pageContext.request.contextPath}/inicio">Volver a Inicio</a>  
	
	
	</div>
	
	<!--   <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.0/dist/jquery.min.js"></script>
			<script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
			<script
				src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js"
				integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy"
				crossorigin="anonymous"></script>
				
				<script>
					$(document).ready( function () {
				    	$('#table_actors').DataTable();
					});
				</script> -->

</body>
</html>