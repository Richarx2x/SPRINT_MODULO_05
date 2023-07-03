<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Formulario de Cliente</title>
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
    <h1>Formulario de Cliente</h1>
    <form action="procesarCliente.jsp" method="post">
        <!-- Aquí se muestran los campos del formulario -->
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" required><br>

        <label for="username">Usuario:</label>
        <input type="text" name="username" required><br>

        <label for="password">Contraseña:</label>
        <input type="password" name="password" required><br>

        <label for="rut">RUT:</label>
        <input type="text" name="rut" required><br>

        <label for="apellido">Apellido:</label>
        <input type="text" name="apellido" required><br>

        <label for="correo">Correo:</label>
        <input type="email" name="correo" required><br>

        <label for="telefono">Teléfono:</label>
        <input type="text" name="telefono" required><br>

        <label for="afp">AFP:</label>
        <input type="text" name="afp" required><br>

        <label for="direccion">Dirección:</label>
        <input type="text" name="direccion" required><br>

        <label for="comuna">Comuna:</label>
        <input type="text" name="comuna" required><br>

        <input type="submit" value="Guardar">
    </form>
</body>
</html>
