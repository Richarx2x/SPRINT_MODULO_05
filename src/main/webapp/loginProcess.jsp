<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Procesando inicio de sesión</title>
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
<body style="background-color: white; color: darkblue;">
    <h1>Procesando inicio de sesión</h1>
    <%@ page import="java.sql.*" %>
    <%@ page import="cl.grupo05.model.dto.UserDTO" %>
    <% 
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Configura los datos de conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/prevencion_grupo05";
        String user = "tu_usuario";
        String pass = "tu_contraseña";

        try {
            // OJO OJO OJO hay que ver como quedaron los usuarios y claves es user y pass
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);

            // Crea una consulta para verificar las credenciales del usuario
            String query = "SELECT * FROM usuarios WHERE username=? AND password=?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);

            // Ejecuta la consulta
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Las credenciales son válidas, el usuario ha iniciado sesión correctamente
                // Aquí puedes redirigir al usuario a la página de inicio (index.jsp) o la que desees
                response.sendRedirect("index.jsp");
            } else {
                // ingreso erroneo, mostrar mensaje de error
                out.println("<h2>CError en usuario y contraseña. Intente nuevamente.</h2>");
            }

            // Cierra las conexiones
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Mostrar mensaje de error en caso de fallo en la conexión o consulta a la base de datos
            out.println("<h2>Error al procesar el inicio, intente nuevamente.</h2>");
        }
    %>
</body>
</html>
