<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">	
  <!--  <meta charset="UTF-8">  -->
  <title>Página de Crear Capacitacion</title>
  <!-- Agrega los enlaces a los archivos CSS de Bootstrap -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>

  <!-- Header con el menú -->
  <jsp:include page="./Header.jsp"></jsp:include>

  <!-- Cuerpo de la página -->
  <div class="container mt-4">
    <h1>Crea una nueva capacitacion</h1>
    <form action="Contacto" method="post">
      <div class="mb-3">
        <label for="nombre" class="form-label">ID de la capacitacion</label>
        <input type="text" class="form-control" id="id-capacitacion" name="id-capacitacion" required>
      </div>
      <div class="mb-3">
        <label for="nombre" class="form-label">Nombre de la capacitacion</label>
        <input type="text" class="form-control" id="nombre-capacitacion" name="nombre-capacitacion" required>
      </div>
      <div class="mb-3">
        <label for="apellido" class="form-label">Rut del solicitante</label>
        <input type="text" class="form-control" id="rut-capacitacion" name="rut-capacitacion" required>
      </div>
      <div class="mb-3">
        <label for="email" class="form-label">Fecha de la capacitacion</label>
        <input type="email" class="form-control" id="fecha-capacitacion" name="fecha-capacitacion" required>
      </div>
       <div class="mb-3">
        <label for="email" class="form-label">Hora de la capacitacion</label>
        <input type="email" class="form-control" id="hora-capacitacion" name="hora-capacitacion" required>
      </div>
      <div class="mb-3">
        <label for="email" class="form-label">Lugar de la capacitacion</label>
        <input type="email" class="form-control" id="lugar-capacitacion" name="lugar-capacitacion" required>
      </div>
      <div class="mb-3">
        <label for="email" class="form-label">Duracion de la capacitacion</label>
        <input type="email" class="form-control" id="duracion-capacitacion" name="duracion-capacitacion" required>
      </div>
      <div class="mb-3">
        <label for="email" class="form-label">Cantidad de asistentes</label>
        <input type="email" class="form-control" id="asistentes-capacitacion" name="asistentes-capacitacion" required>
      </div>
     
      <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
  </div>

  <!-- Agrega los enlaces a los archivos JavaScript de Bootstrap -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>