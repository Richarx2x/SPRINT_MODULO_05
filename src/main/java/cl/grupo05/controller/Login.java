package cl.grupo05.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.grupo05.model.service.*;
import cl.grupo05.model.dto.UserDTO;

@WebServlet("/")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private UserService usService= new UserService();
    
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("views/login.jsp").forward(request, response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un = request.getParameter("username");
		String pw = request.getParameter("password");
		
		UserDTO user = usService.login(un, pw);
		
		if(user!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("login",true);
			getServletContext().getRequestDispatcher("/crearUsuario").forward(request, response);
		}else {
			//String message ="Datos inválidos";
			//request.setAttribute("message", message);
			//session.setAttribute("login",false);
			getServletContext().getRequestDispatcher("views/login.jsp").forward(request, response);
		}
		//request.getRequestDispatcher("success.jsp").forward(request, response);
		
	}

}
