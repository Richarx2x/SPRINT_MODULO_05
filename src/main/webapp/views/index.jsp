<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Sistema de Capacitacion 2.0</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <h1 style="color: darkgreen; font-family: verdana, arial;">Sistema de Capacitacion 2.0</h1>
    <ul>
        <h2 style="color: darkgreen; font-family: verdana, arial;">Menu de Opciones</h2>
        <li><a href="usuario.jsp" style="color: darkgreen; font-family: verdana, arial;">Ingresar Usuario</a></li>
        <li><a href= "${pageContext.request.contextPath}/listaUsuario" style="color: darkgreen; font-family: verdana, arial;">Mostrar lista de usuarios</a></li>
        <li><a href="modificacion.jsp" style="color: darkgreen; font-family: verdana, arial;">Modificar Registros</a></li>
        <li><a href="contacto.jsp" style="color: darkgreen; font-family: verdana, arial;">Contactar compañia</a></li>
        <li><a href="login.jsp" style="color: darkgreen; font-family: verdana, arial;">Salir</a></li>
    </ul>
    <div class="footer">
        &copy; 2023 Sistema de Capacitación 2.0
    </div>
</body>
</html>
