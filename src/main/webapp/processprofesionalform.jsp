<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Registro Profesional</title>
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
    <h1>Procesar Profesional</h1>
    <%-- Obtener los parámetros enviados desde el formulario --%>
    <%@ page import="cl.grupo05.model.dto.ProfDTO" %>
    <% 
        String nombre = request.getParameter("nombre");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String run = request.getParameter("run");
        String apellido = request.getParameter("apellido");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
        String cargo = request.getParameter("cargo");

        if (nombre != null && !nombre.isEmpty() &&
            username != null && !username.isEmpty() &&
            password != null && !password.isEmpty() &&
            run != null && !run.isEmpty() &&
            apellido != null && !apellido.isEmpty() &&
            correo != null && !correo.isEmpty() &&
            telefono != null && !telefono.isEmpty() &&
            cargo != null && !cargo.isEmpty()) {


            ProfDTO profesor = new ProfDTO(0, nombre, username, password, run, apellido, correo, telefono, cargo);
            
            // Mostrar mensaje de éxito
            out.println("<h2>El profesional ha sido guardado correctamente.</h2>");
        } else {
            // Mostrar mensaje de error
            out.println("<h2>Todos los campos son requeridos. Por favor, complete todos los campos.</h2>");
        }
    %>
</body>
</html>
