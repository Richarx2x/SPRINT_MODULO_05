<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Contacto</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>Sistema de Capacitación 2.0</h1>
        <form method="post" action="procesar-contacto.jsp">
            <div class="form-group">
                <label for="nombre">Nombre:</label>
                <input type="text" name="nombre" id="nombre" required>
            </div>
            <div class="form-group">
                <label for="rut">RUT:</label>
                <input type="text" name="rut" id="rut" required>
            </div>
            <div class="form-group">
                <label for="correo">Correo Electrónico:</label>
                <input type="email" name="correo" id="correo" required>
            </div>
            <div class="form-group">
                <label for="telefono">Teléfono:</label>
                <input type="tel" name="telefono" id="telefono" required>
            </div>
            <div class="form-group">
                <label for="mensaje">Mensaje:</label>
                <textarea name="mensaje" id="mensaje" required></textarea>
            </div>
            <div class="form-group">
                <input type="submit" value="Enviar" class="submit-button">
            </div>
        </form>
    </div>
    <div class="footer">
        &copy; 2023 Sistema de Capacitación 2.0
    </div>
</body>
</html>
