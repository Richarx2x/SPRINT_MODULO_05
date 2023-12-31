<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Creacion Personal Administrativo</title>
  <link rel="stylesheet" type="text/css" href="styles.css">
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
  <h1>Ingreso Informacion Administrativo</h1>
  
  <form action="processAdminForm.jsp" method="post">
    <label for="id">ID:</label>
    <input type="text" name="id" required><br><br>
    
    <label for="nombre">Nombre:</label>
    <input type="text" name="nombre" required><br><br>
    
    <label for="username">Username:</label>
    <input type="text" name="username" required><br><br>
    
    <label for="password">Password:</label>
    <input type="password" name="password" required><br><br>
    
    <label for="run">Run:</label>
    <input type="text" name="run" required><br><br>
    
    <label for="apellido">Apellido:</label>
    <input type="text" name="apellido" required><br><br>
    
    <label for="correo">Correo:</label>
    <input type="email" name="correo" required><br><br>
    
    <label for="area">Área:</label>
    <input type="text" name="area" required><br><br>
    
    <input type="submit" value="Enviar">
  </form>
  
  <div id="error-popup" class="error-message">
    <p id="error-message"></p>
  </div>
  
  <%-- Chequeo de errores --%>
  <%
    String error = request.getParameter("error");
    if (error != null && error.equals("true")) {
      String errorMessage = request.getParameter("errorMessage");
      out.println("<script>showErrorPopup('" + errorMessage + "');</script>");
    }
  %>
  <div class="footer">
    &copy; 2023 Sistema de Capacitación 2.0
</div>
</body>
</html>
