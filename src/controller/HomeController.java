package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import domain.EmployeeDTO;


@WebServlet("/home.do")
public class Homecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("context", request.getContextPath());
		String compo =request.getParameter("compo");
		System.out.println(compo+"================");
		
		if(compo==null){
			request.setAttribute("compo", "pre");
			
		}else{
			request.setAttribute("compo", "post");
		}
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/home/main.jsp");
		rd.forward(request, response);	
		
	
	}

}
