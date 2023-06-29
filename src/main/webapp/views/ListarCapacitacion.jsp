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
  <!-- Header con el menú -->
  <jsp:include page="./Header.jsp"></jsp:include>

  <!-- Cuerpo de la página -->
  <div class="container mt-4">
    <h1>Lista de Capacitaciones</h1>
    <table class="table">
      <thead>
        <tr>
          <th>ID</th>
          <th>Rut del Solicitante</th>
          <th>Dia</th>
          <th>Hora</th>
          <th>Lugar</th>
          <th>Duración</th>
        </tr>
      </thead>
      <tbody>
        <%-- Aquí se debe iterar sobre la lista de capacitaciones y mostrar cada una --%>
        <%-- Supongamos que la lista de capacitaciones se llama "capacitaciones" y es un atributo del request --%>
        <c:forEach var="capacitacion" items="${requestScope.capacitaciones}">
          <tr>
            <td>${capacitacion.idCapacitacion}</td>
            <td>${capacitacion.rutSolicitante}</td>
            <td>${capacitacion.diaCapacitacion}</td>
            <td>${capacitacion.horaCapacitacion}</td>
            <td>${capacitacion.lugarCapacitacion}</td>
            <td>${capacitacion.duracionCapacitacion}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>

  <!-- Agrega los enlaces a los archivos JavaScript de Bootstrap -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

