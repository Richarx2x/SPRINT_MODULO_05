<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">	
  <!--  <meta charset="UTF-8">  -->
  <title>Página de Contacto</title>
  <!-- Agrega los enlaces a los archivos CSS de Bootstrap -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>

  <!-- Header con el menú -->
  <jsp:include page="./Header.jsp"></jsp:include>

  <!-- Cuerpo de la página -->
  <div class="container mt-4">
    <h1>Contacto</h1>
    <form action="Contacto" method="post">
      <div class="mb-3">
        <label for="nombre" class="form-label">Nombre</label>
        <input type="text" class="form-control" id="nombre" name="nombre" required>
      </div>
      <div class="mb-3">
        <label for="apellido" class="form-label">Apellido</label>
        <input type="text" class="form-control" id="apellido" name="apellido" required>
      </div>
      <div class="mb-3">
        <label for="email" class="form-label">Correo electrónico</label>
        <input type="email" class="form-control" id="email" name="email" required>
      </div>
      <div class="mb-3">
        <label for="solicitud" class="form-label">Solicitud</label>
        <textarea class="form-control" id="solicitud" name="solicitud" rows="5" required></textarea>
      </div>
      <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
  </div>

  <!-- Agrega los enlaces a los archivos JavaScript de Bootstrap -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
