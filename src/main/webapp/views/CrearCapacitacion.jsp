<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Registro de Capacitación</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        h1 {
            color: #333;
        }
        label {
            display: block;
            margin-bottom: 5px;
        }
        input[type="text"], input[type="number"], input[type="date"] {
            width: 200px;
            padding: 5px;
            margin-bottom: 10px;
        }
        input[type="submit"] {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: #fff;
            border: none;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <h1>Registro de Capacitación</h1>
    <form action="CapacitationServlet" method="post">
        <label for="identificador">Identificador:</label>
        <input type="number" id="identificador" name="identificador" required>

        <label for="rutCliente">RUT Cliente:</label>
        <input type="number" id="rutCliente" name="rutCliente" required>

        <label for="dia">Día:</label>
        <input type="date" id="dia" name="dia" required>

        <label for="hora">Hora:</label>
        <input type="text" id="hora" name="hora" required>

        <label for="lugar">Lugar:</label>
        <input type="text" id="lugar" name="lugar" required>

        <label for="duracion">Duración:</label>
        <input type="text" id="duracion" name="duracion" required>

        <label for="cantidadAsistentes">Cantidad de Asistentes:</label>
        <input type="number" id="cantidadAsistentes" name="cantidadAsistentes" required>

        <input type="submit" value="Registrar">
    </form>
</body>
</html>