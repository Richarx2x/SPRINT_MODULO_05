package cl.grupo05.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.grupo05.model.dto.*;
import cl.grupo05.model.service.*;


@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService usService= new UserService();   
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String un = request.getParameter("username");
		String pw = request.getParameter("password");

		
		UserDTO user = usService.login(un, pw);
		if(user!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("login",true);
			getServletContext().getRequestDispatcher("/inicio").forward(request, response);
		}else {
			getServletContext().getRequestDispatcher("views/login.jsp").forward(request, response);
		}
		
		
	}

}
