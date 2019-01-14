package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import command.Command;
import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String context = request.getContextPath();
		HttpSession session = request.getSession();
		MemberService memberService = MemberServiceImpl.getInstance();
		MemberBean member = null;
		System.out.println("==========멤버 서블릿으로 진입===========");
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move" : cmd;
		String dir = request.getParameter("dir");
		if (dir == null) {
			dir = request.getServletPath().substring(1, request.getServletPath().indexOf("."));
		}
		String page = request.getParameter("page");
		page = (page == null) ? "main" : page;
		
		String dest = request.getParameter("dest");
		if(dest == null) {page = "NONE";}
		
	
		switch (cmd) {
		case "login":
			member = new MemberBean();
			String id = request.getParameter("uid");
			String pass = request.getParameter("upass");
			boolean loginOk = memberService.existMember(id, pass);
			if (loginOk) {
				member = MemberServiceImpl.getInstance().findMemberById(id);
				session.setAttribute("user", member);
				request.setAttribute("dest", dest);

			} else {
				dir = "";
				page = "index";
			}
			break;
		case "move":
			request.setAttribute("dest", dest);
			break;
		case "join":
			member = new MemberBean();
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPass(request.getParameter("pass"));
			member.setSsn(request.getParameter("ssn"));
			MemberServiceImpl.getInstance().createMember(member);
			member = MemberServiceImpl.getInstance().findMemberById(member.getId());
			session.setAttribute("user", member);
			request.setAttribute("dest", dest);

			break;
		case "logout":
			dir = "";
			page = "index";
			session.invalidate();
			break;
	
		}
		Command.move(request, response, dir, page);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
