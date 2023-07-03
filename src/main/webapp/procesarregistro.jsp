<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Procesar Registro</title>
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
<body style="background-color: white; color: darkgreen;">
    <h1>Procesar Registro</h1>
    <%-- Obtener los parámetros enviados desde el formulario --%>
    <%@ page import="cl.grupo05.model.dto.UserDTO" %>
    <% 
        String nombre = request.getParameter("nombre");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String tipo = request.getParameter("tipo");

        // Validar que todos los campos contengan datos
        if (nombre != null && !nombre.isEmpty() &&
            username != null && !username.isEmpty() &&
            password != null && !password.isEmpty() &&
            tipo != null && !tipo.isEmpty()) {
            
            // Redireccionar según el tipo de usuario seleccionado
            if (tipo.equals("cliente")) {
                response.sendRedirect("Cliente.jsp");
            } else if (tipo.equals("profesional")) {
                response.sendRedirect("Profesional.jsp");
            } else if (tipo.equals("admin")) {
                response.sendRedirect("Admin.jsp");
            }
            
        } else {
            // Mostrar mensaje de error
            out.println("<h2>Todos los campos son requeridos. Por favor, complete todos los campos.</h2>");
        }
    %>
</body>
</html>
