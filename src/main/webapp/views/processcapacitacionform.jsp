<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="cl.grupo05.model.dto.CapacitacionDTO" %>
<!DOCTYPE html>
<html>
<head>
  <title>Procesando Formulario de Capacitacion</title>
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
  <h1>Procesando Formulario de Capacitacion</h1>
  
  <%
String nombre = request.getParameter("nombre");
String detalle = request.getParameter("detalle");
String fecha = request.getParameter("fecha");
String hora = request.getParameter("hora");
String lugar = request.getParameter("lugar");
int duracion = Integer.parseInt(request.getParameter("duracion"));
int cantidad = Integer.parseInt(request.getParameter("cantidad"));
    
    // Realizar validación
    boolean isValid = true;
    String errorMessage = "";
    
    // Validar los datos del formulario
    // Agrega tu propia lógica de validación aquí
    
    // Si la validación falla, redirige de vuelta al formulario con un mensaje de error
    if (!isValid) {
      response.sendRedirect("capacitacionForm.jsp?error=true&errorMessage=" + errorMessage);
    } else {
      // Crear una instancia de CapacitacionDTO con los datos del formulario
      CapacitacionDTO capacitacion = new CapacitacionDTO(nombre, detalle, fecha, hora, lugar, duracion, cantidad);
      
      // TODO: Procesar el objeto CapacitacionDTO según sea necesario
      
      // Mostrar mensaje de éxito
      out.println("<p class='success-message'>Formulario de Capacitacion enviado exitosamente</p>");
    }
  %>
</body>
</html>
