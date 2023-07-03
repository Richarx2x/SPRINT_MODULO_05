import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AccidentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/nombre_basedatos";
    private static final String DB_USER = "usuario";
    private static final String DB_PASSWORD = "contraseña";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Obtener los parámetros del formulario
            int identificador = Integer.parseInt(request.getParameter("identificador"));
            int rutCliente = Integer.parseInt(request.getParameter("rutCliente"));
            Date dia = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dia"));
            String hora = request.getParameter("hora");
            String lugar = request.getParameter("lugar");
            String origen = request.getParameter("origen");
            String consecuencias = request.getParameter("consecuencias");

            // Registrar el accidente en la base de datos
            registerAccident(identificador, rutCliente, dia, hora, lugar, origen, consecuencias);

            // Redirigir a una página de éxito o mostrar un mensaje de éxito
            response.sendRedirect("exito.html");
        } catch (ParseException e) {
            e.printStackTrace();
            // Manejar el error en caso de que la fecha no pueda ser parseada correctamente
            response.sendRedirect("error.html");
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejar el error en caso de que ocurra un problema con la base de datos
            response.sendRedirect("error.html");
        }
    }

    private void registerAccident(int identificador, int rutCliente, Date dia, String hora, String lugar,
            String origen, String consecuencias) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // Establecer la conexión con la base de datos
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Preparar la consulta SQL para insertar un nuevo accidente
            String query = "INSERT INTO accidentes (identificador, rutCliente, dia, hora, lugar, origen, consecuencias) VALUES (?, ?, ?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, identificador);
            stmt.setInt(2, rutCliente);
            stmt.setDate(3, new java.sql.Date(dia.getTime()));
            stmt.setString(4, hora);
            stmt.setString(5, lugar);
            stmt.setString(6, origen);
            stmt.setString(7, consecuencias);

            // Ejecutar la consulta
            stmt.executeUpdate();
        } finally {
            // Cerrar los recursos
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}
