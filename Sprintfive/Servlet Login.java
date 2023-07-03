import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    // Datos de conexión a la base de datos
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String DB_USERNAME = "tu_usuario";
    private static final String DB_PASSWORD = "tu_contraseña";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Validar el usuario y la contraseña
        if (validateUser(username, password)) {
            // Si la autenticación es exitosa, redirigir a la página principal
            response.sendRedirect("index.html");
        } else {
            // Si la autenticación falla, redirigir al formulario de login nuevamente
            response.sendRedirect("login.html");
        }
    }

    private boolean validateUser(String username, String password) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Establecer conexión con la base de datos
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            // Ejecutar consulta para validar el usuario y la contraseña
            String sql = "SELECT COUNT(*) FROM usuarios WHERE username = ? AND password = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            rs = stmt.executeQuery();

            // Obtener el resultado de la consulta
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0; // Si hay al menos una fila con el usuario y la contraseña proporcionados, la autenticación es exitosa
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return false; // Si ocurre algún error o no se encuentra el usuario, la autenticación falla
    }
}
