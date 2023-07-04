<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Formulario de Registro de Usuarios</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <h1>Formulario de Registro</h1>
    <form action="procesarregistro.jsp" method="post">
        <!-- Aquí se muestran los campos del formulario -->
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" required><br>

        <label for="username">Usuario:</label>
        <input type="text" name="username" required><br>

        <label for="password">Contraseña:</label>
        <input type="password" name="password" required><br>

        <label for="tipo">Tipo de usuario:</label>
        <select name="tipo" required>
            <option value="">Selecciona una opción</option>
            <option value="cliente">Cliente</option>
            <option value="profesional">Profesional</option>
            <option value="admin">Admin</option>
        </select><br>

        <input type="submit" value="Registrarse">
    </form>
    <div class="footer">
        &copy; 2023 Sistema de Capacitación 2.0
    </div>
</body>
</html>
