package accueil;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("jsp/menu.jsp")
public class MenuServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("coucou");
		req.setCharacterEncoding("utf-8");
		System.out.println("coucou1");
		String name = req.getParameter("name");
		System.out.println("coucou2");
		resp.setContentType("text/plain");
		System.out.println("coucou3");
		req.setAttribute("estCo", true);
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("index.jsp");
		rd.forward(req, resp);
	}
}