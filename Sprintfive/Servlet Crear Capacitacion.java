import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CapacitationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Datos de conexión a la base de datos
    private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String JDBC_USERNAME = "usuario";
    private static final String JDBC_PASSWORD = "contraseña";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener los parámetros del formulario HTML
        int identificador = Integer.parseInt(request.getParameter("identificador"));
        int rutCliente = Integer.parseInt(request.getParameter("rutCliente"));
        String dia = request.getParameter("dia");
        String hora = request.getParameter("hora");
        String lugar = request.getParameter("lugar");
        String duracion = request.getParameter("duracion");
        int cantidadAsistentes = Integer.parseInt(request.getParameter("cantidadAsistentes"));

        // Crear una conexión a la base de datos
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD)) {
            // Preparar la sentencia SQL para insertar la capacitación en la base de datos
            String sql = "INSERT INTO Capacitaciones (identificador, rutCliente, dia, hora, lugar, duracion, cantidadAsistentes) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, identificador);
            statement.setInt(2, rutCliente);
            statement.setString(3, dia);
            statement.setString(4, hora);
            statement.setString(5, lugar);
            statement.setString(6, duracion);
            statement.setInt(7, cantidadAsistentes);

            // Ejecutar la sentencia SQL
            int rowsAffected = statement.executeUpdate();

            // Enviar una respuesta al cliente
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>Registro de Capacitación</h1>");
            if (rowsAffected > 0) {
                out.println("<p>La capacitación se ha registrado exitosamente.</p>");
            } else {
                out.println("<p>Ocurrió un error al registrar la capacitación.</p>");
            }
            out.println("</body></html>");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException("Error de conexión a la base de datos", e);
        }
    }
}
