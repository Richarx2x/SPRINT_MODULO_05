import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recuperar información del request GET
        String parameter1 = request.getParameter("param1");
        String parameter2 = request.getParameter("param2");

        // Lógica para procesar los parámetros recibidos

        // Configurar la respuesta
        response.setContentType("text/html");
        response.getWriter().println("<h1>GET Request Processed</h1>");
        response.getWriter().println("<p>Parameter 1: " + parameter1 + "</p>");
        response.getWriter().println("<p>Parameter 2: " + parameter2 + "</p>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recuperar información del request POST
        String parameter1 = request.getParameter("param1");
        String parameter2 = request.getParameter("param2");

        // Lógica para procesar los parámetros recibidos

        // Configurar la respuesta
        response.setContentType("text/html");
        response.getWriter().println("<h1>POST Request Processed</h1>");
        response.getWriter().println("<p>Parameter 1: " + parameter1 + "</p>");
        response.getWriter().println("<p>Parameter 2: " + parameter2 + "</p>");
    }
}
