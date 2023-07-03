import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrarClienteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros del formulario
        String nombre = request.getParameter("nombre");
        String fechaNacimiento = request.getParameter("fechaNacimiento");
        int run = Integer.parseInt(request.getParameter("run"));
        int rut = Integer.parseInt(request.getParameter("rut"));
        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String telefono = request.getParameter("telefono");
        String afp = request.getParameter("afp");
        int sistemaSalud = Integer.parseInt(request.getParameter("sistemaSalud"));
        String direccion = request.getParameter("direccion");
        String comuna = request.getParameter("comuna");
        int edad = Integer.parseInt(request.getParameter("edad"));

        // Realizar la conexión a la base de datos (Oracle)
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String usuario = "nombre_usuario";
        String contraseña = "contraseña_usuario";
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(url, usuario, contraseña);

            // Preparar la sentencia SQL para insertar el cliente en la base de datos
            String sql = "INSERT INTO clientes (nombre, fecha_nacimiento, run, rut, nombres, apellidos, telefono, afp, sistema_salud, direccion, comuna, edad) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setString(2, fechaNacimiento);
            statement.setInt(3, run);
            statement.setInt(4, rut);
            statement.setString(5, nombres);
            statement.setString(6, apellidos);
            statement.setString(7, telefono);
            statement.setString(8, afp);
            statement.setInt(9, sistemaSalud);
            statement.setString(10, direccion);
            statement.setString(11, comuna);
            statement.setInt(12, edad);

            // Ejecutar la sentencia SQL para insertar el cliente
            int filasInsertadas = statement.executeUpdate();

            if (filasInsertadas > 0) {
                // Cliente registrado exitosamente
                response.sendRedirect("registro-exitoso.html");
            } else {
                // Error al registrar el cliente
                response.sendRedirect("registro-error.html");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Error en la conexión o consulta a la base de datos
            response.sendRedirect("registro-error.html");
        } finally {
            // Cerrar la conexión y liberar los recursos
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
