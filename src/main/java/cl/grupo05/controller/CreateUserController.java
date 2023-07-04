package cl.grupo05.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Usuarios/Crear")
public class CreateUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CreateUserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/views/usuario.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        String nombre = request.getParameter("nombre");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String tipo = request.getParameter("tipo");

        // Validar que todos los campos contengan datos
        if (nombre != null && !nombre.isEmpty() &&
            username != null && !username.isEmpty() &&
            password != null && !password.isEmpty() &&
            tipo != null && !tipo.isEmpty()) {
            
            // Redireccionar según el tipo de usuario seleccionado
            if (tipo.equals("cliente")) {
                response.sendRedirect("/views/Cliente.jsp");
            } else if (tipo.equals("profesional")) {
                response.sendRedirect("/views/Profesional.jsp");
            } else if (tipo.equals("admin")) {
                response.sendRedirect("/views/Admin.jsp");
            }
            
        } else {
            // Mostrar mensaje de error
            System.out.println("<h2>Todos los campos son requeridos. Por favor, complete todos los campos.</h2>");
        }
	}

}
