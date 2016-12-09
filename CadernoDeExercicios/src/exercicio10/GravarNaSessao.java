package exercicio10;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/gravaSessao")
public class GravarNaSessao extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sessao = request.getSession();
		sessao.setAttribute("nome", request.getParameter("nome"));
		response.getWriter().println("feito");
		response.sendRedirect("ex10.jsp");
	}

}
