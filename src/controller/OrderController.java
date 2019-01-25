package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.OrderService;
import service.OrderServiceImpl;

/**
 * Servlet implementation class OrderController
 */
@WebServlet("/Order.do")
public class OrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	OrderService orderService = OrderServiceImpl.getInstance();
	
	protected void Service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
	
	}
}