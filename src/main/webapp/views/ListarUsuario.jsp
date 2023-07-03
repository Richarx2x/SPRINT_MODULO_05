<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">	
  <title>Lista de Capacitaciones</title>
  <!-- Agrega los enlaces a los archivos CSS de Bootstrap -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
  <!-- Header con el men� -->
  <jsp:include page="./Header.jsp"></jsp:include>

  <!-- Cuerpo de la p�gina -->
  <div class="container mt-4">
    <h1>Lista de Usuarios</h1>
    <table class="table">
      <thead>
        <tr>
          <th>RUN</th>
          <th>Nombre</th>
          <th>Apellido</th>
          <th>Fecha Nacimiento</th>
          <th>Tel�fono</th>
          <th>AFP</th>
          <th>Sistema de Salud</th>
          <th>Direccion</th>
          <th>Comuna</th>
          <th>Edad</th>
          <th>Titulo</th>
          <th>Fecha ingreso</th>
        </tr>
      </thead>
      <tbody>
        <%-- Aqu� se debe iterar sobre la lista de capacitaciones y mostrar cada una --%>
        <%-- Supongamos que la lista de capacitaciones se llama "capacitaciones" y es un atributo del request --%>
        <c:forEach var="capacitacion" items="${requestScope.usuarios}">
          <tr>
            <td>${usuario.runUsuario}</td>
            <td>${usuario.nombreUsuario}</td>
            <td>${usuario.apellidoUsuario}</td>
            <td>${usuario.fechaNacimientoUsuario}</td>
            <td>${usuario.telefonoUsuario}</td>
            <td>${usuario.afpUsuario}</td>
            <td>${usuario.sistemaSaludUsuario}</td>
            <td>${usuario.direccionUsuario}</td>
            <td>${usuario.comunaUsuario}</td>
            <td>${usuario.edadUsuario}</td>
            <td>${usuario.tituloUsuario}</td>
            <td>${usuario.fechaIngresoUsuario}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>

  <!-- Agrega los enlaces a los archivos JavaScript de Bootstrap -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
