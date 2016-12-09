package exercicio5;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex5")
public class Servlet5 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] lista = new String[3];
		lista[0] = "string1";
		lista[1] = "string2";
		lista[2] = "string3";

		request.setAttribute("x", lista);
		RequestDispatcher despacho = getServletContext().getRequestDispatcher("/ex5.jsp");
		despacho.forward(request, response);
	}

}
