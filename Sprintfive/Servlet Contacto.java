import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContactoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Generar código HTML del formulario de contacto
        String html = "<html><head><title>Contacto</title></head><body>";
        html += "<h1>Contacto</h1>";
        html += "<form action=\"contacto\" method=\"post\">";
        html += "<input type=\"text\" name=\"nombre\" placeholder=\"Nombre\"><br>";
        html += "<input type=\"email\" name=\"email\" placeholder=\"Email\"><br>";
        html += "<textarea name=\"mensaje\" placeholder=\"Mensaje\"></textarea><br>";
        html += "<input type=\"submit\" value=\"Enviar\">";
        html += "</form>";
        // Resto del contenido HTML
        html += "</body></html>";

        // Configurar la respuesta
        response.setContentType("text/html");
        response.getWriter().println(html);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Procesar los datos enviados por el formulario de contacto
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        String mensaje = request.getParameter("mensaje");

        // Lógica para procesar los datos y enviar el mensaje de contacto

        // Redireccionar a una página de confirmación
        response.sendRedirect("contacto-confirmacion.html");
    }
}
