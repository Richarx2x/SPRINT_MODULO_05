<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio</title>
</head>
<body>
<div class="container">
	<jsp:include page="header.jsp"></jsp:include>

	<h2>ASESORIAS</h2>

<div class="container">
<h3>Iniciar sesion</h3>
<form action="${pageContext.request.contextPath}/login" method="post" class="form align-self-center">
			<div class="mb-3 row">
		  		<label class="col-sm-2 col-form-label" for="username">Nombre :</label>
		  		<div class="col-sm-4">
	  				<input type="text" id="nombre" name="nombre" class="form-control">
	  			</div>	
			</div>
			<div class="mb-3 row">
				<label for="password" class="col-sm-2 col-form-label">Contraseña:</label>
				<div class="col-sm-4">
					<input type="password" id="contraseña" name="contraseña" class="form-control">	
				</div>
			</div>
			<div class="mb-3 row justify-content-evenly">
				<div class="col-sm-4 align-self-rigth">
					<button type="submit" class="btn btn-primary">Iniciar Sesion</button>
				</div>
			</div>
			
		</form>

</div>
	<jsp:include page="footer.jsp"></jsp:include>
</div>


<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>