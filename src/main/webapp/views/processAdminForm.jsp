<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="cl.grupo05.model.dto.AdminDTO" %>
<!DOCTYPE html>
<html>
<head>
  <title>Procesando Formulario de Admin</title>
  <style>
    body {
      background-color: white;
      color: green;
    }
    
    .success-message {
      color: green;
      font-weight: bold;
    }
  </style>
</head>
<body>
  <h1>Procesando Formulario de Administrativo</h1>
  
  <%
    String id = request.getParameter("id");
    String nombre = request.getParameter("nombre");
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String run = request.getParameter("run");
    String apellido = request.getParameter("apellido");
    String correo = request.getParameter("correo");
    String area = request.getParameter("area");
    
    // Realizar validación
    boolean isValid = true;
    String errorMessage = "";
    
    // Validar los datos del formulario
    // Agrega tu propia lógica de validación aquí
    
    // Si la validación falla, redirige de vuelta al formulario con un mensaje de error
    if (!isValid) {
      response.sendRedirect("adminForm.jsp?error=true&errorMessage=" + errorMessage);
    } else 
    {
   

      AdminDTO admin = new AdminDTO(id, nombre, username, password, run, apellido, correo, area);
      
      // TODO: Procesar el objeto AdminDTO según sea necesario
      
      // Mostrar mensaje de éxito
      out.println("<p class='success-message'>¡Formulario de Admin enviado exitosamente!</p>");
    }
  %>
</body>
</html>
