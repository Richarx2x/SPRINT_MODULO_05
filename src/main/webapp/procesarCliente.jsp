<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Procesar Cliente</title>
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
    <h1>Procesar Cliente</h1>
    <%-- Obtener los parámetros enviados desde el formulario --%>
    <%@ page import="cl.grupo05.model.dto.ClteDTO" %>
    <% 
        String nombre = request.getParameter("nombre");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String rut = request.getParameter("rut");
        String apellido = request.getParameter("apellido");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
        String afp = request.getParameter("afp");
        String direccion = request.getParameter("direccion");
        String comuna = request.getParameter("comuna");

        // Validar que todos los campos contengan datos
        if (nombre != null && !nombre.isEmpty() &&
            username != null && !username.isEmpty() &&
            password != null && !password.isEmpty() &&
            rut != null && !rut.isEmpty() &&
            apellido != null && !apellido.isEmpty() &&
            correo != null && !correo.isEmpty() &&
            telefono != null && !telefono.isEmpty() &&
            afp != null && !afp.isEmpty() &&
            direccion != null && !direccion.isEmpty() &&
            comuna != null && !comuna.isEmpty()) {
            
            // Crear una instancia de ClteDTO con los datos ingresados
            ClteDTO cliente = new ClteDTO(0, nombre, username, password, rut, apellido, correo, telefono, afp, direccion, comuna);
            
            // Mostrar mensaje de éxito
            out.println("<h2>El cliente ha sido guardado correctamente.</h2>");
        } else {
            // Mostrar mensaje de error
            out.println("<h2>Todos los campos son requeridos. Por favor, complete todos los campos.</h2>");
        }
    %>
</body>
</html>
