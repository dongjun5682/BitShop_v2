package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CategoryService;
import service.CategoryServiceImpl;

/**
 * Servlet implementation class CategoryController
 */
@WebServlet("/Category.do")
public class CategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	CategoryService categoryService = CategoryServiceImpl.getInstance();
	
	protected void Service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
	
	}

}
