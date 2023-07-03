<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Iniciar sesión</title>
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
    <h1>Iniciar sesión</h1>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <label for="usuario">Usuario:</label>
        <input type="text" name="username" required><br>

        <label for="contrasena">Contraseña:</label>
        <input type="password" name="password" required><br>

        <input type="submit" value="Ingresar">
    </form>
</body>
</html>
