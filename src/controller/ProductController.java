package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ProductService;
import service.ProductServiceImpl;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/Product.do")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ProductService productService = ProductServiceImpl.getInstance();
	
	protected void Service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
