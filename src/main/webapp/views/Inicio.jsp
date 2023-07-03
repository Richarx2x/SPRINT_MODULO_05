<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">	
  <!--  <meta charset="UTF-8">  -->
  <title>Página de Inicio</title>
  <!-- Agrega los enlaces a los archivos CSS de Bootstrap -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>

  <!-- Header con el menú -->
  <jsp:include page="./Header.jsp"></jsp:include>

  <!-- Cuerpo de la página -->
  <div class="container mt-4">
    <h1>Bienvenido a nuestra página de inicio</h1>
    <h2>Subtítulo</h2>
    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tempor 
    ligula non mauris rhoncus, vitae dapibus lorem efficitur. Pellentesque id ligula sem. 
    Sed in ipsum eu dui aliquet pharetra. Morbi eu dolor in sem varius viverra. Proin 
    consectetur libero mi, id tincidunt mauris convallis vitae. Fusce interdum ullamcorper 
    bibendum. Phasellus tempor elit et lacus accumsan malesuada. Pellentesque habitant morbi 
    tristique senectus et netus et malesuada fames ac turpis egestas.</p>
  </div>
  <div class="container mt-4">
  <%  // Scriptlet
      String mensaje = "¡Hola, mundo!";
      out.println("<p>" + mensaje + "</p>");
      
      int numero = 5;
      out.println("<p>El número es: " + numero + "</p>");
   %>
  </div>

  <!-- Agrega los enlaces a los archivos JavaScript de Bootstrap -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

