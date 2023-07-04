<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio sesion</title>
</head>
<body>
<div class="container">
<form action="${pageContext.request.contextPath}/login" method="post" class="form align-self-center">
			<div class="mb-3 row">
		  		<label class="col-sm-2 col-form-label" for="username">Nombre :</label>
		  		<div class="col-sm-4">
	  				<input type="text" id="nombre" name="username" class="form-control">
	  			</div>	
			</div>
			<div class="mb-3 row">
				<label for="password" class="col-sm-2 col-form-label">Contraseña:</label>
				<div class="col-sm-4">
					<input type="password" id="contraseña" name="password" class="form-control">	
				</div>
			</div>
			<div class="mb-3 row justify-content-evenly">
				<div class="col-sm-4 align-self-rigth">
					<button type="submit" class="btn btn-primary">Iniciar Sesion</button>
				</div>
			</div>
			
		</form>

</div>
</body>
</html>