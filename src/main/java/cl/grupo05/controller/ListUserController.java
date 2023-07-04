package cl.grupo05.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.grupo05.model.service.UserService;


@WebServlet("/listaUsuario")
public class ListUserController extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	private UserService usService = new UserService(); 
    public ListUserController() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		
		if (session.getAttribute("login") == null) {
			getServletContext().getRequestDispatcher("/login").forward(request, response);
		}
		
		boolean logg = (boolean)session.getAttribute("login");
		
		if (!logg) {
			getServletContext().getRequestDispatcher("/login").forward(request, response);
		} 
		
		
		request.setAttribute("usuarios", usService.findAll());
		
		getServletContext().getRequestDispatcher("/views/listadosUsuarios.jsp").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}