<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Capacitacion </title>
  <style>
    body {
      background-color: white;
      color: green;
    }
    
    .error-message {
      display: none;
      position: fixed;
      top: 50%;
      left: 50%;
      transform: translate(-50%, -50%);
      padding: 10px;
      background-color: rgba(0, 255, 42, 0.172);
      color: white;
      font-weight: bold;
    }
  </style>
  <script>
    function showErrorPopup(message) {
      var errorPopup = document.getElementById("error-popup");
      var errorMessage = document.getElementById("error-message");
      errorMessage.innerHTML = message;
      errorPopup.style.display = "block";
    }
  </script>
</head>
<body>
  <h1>Formulario de Capacitacion</h1>
  
  <form action="processCapacitacionForm.jsp" method="post">
    <label for="nombre">Nombre:</label>
    <input type="text" name="nombre" required><br><br>
    
    <label for="detalle">Detalle:</label>
    <input type="text" name="detalle" required><br><br>
    
    <label for="fecha">Fecha:</label>
    <input type="text" name="fecha" required><br><br>
    
    <label for="hora">Hora:</label>
    <input type="text" name="hora" required><br><br>
    
    <label for="lugar">Lugar:</label>
    <input type="text" name="lugar" required><br><br>
    
    <label for="duracion">Duración:</label>
    <input type="text" name="duracion" required><br><br>
    
    <label for="cantidad">Cantidad:</label>
    <input type="text" name="cantidad" required><br><br>
    
    <input type="submit" value="Enviar">
  </form>
  
  <div id="error-popup" class="error-message">
    <p id="error-message"></p>
  </div>
  
  <%-- Chequeo de error y mensajes de error --%>
  <%
    String error = request.getParameter("error");
    if (error != null && error.equals("true")) {
      String errorMessage = request.getParameter("errorMessage");
      out.println("<script>showErrorPopup('" + errorMessage + "');</script>");
    }
  %>
</body>
</html>
