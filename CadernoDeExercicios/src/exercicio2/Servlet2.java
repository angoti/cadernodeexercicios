package exercicio2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex2")
public class Servlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Nome n1 = new Nome();
		n1.primeiroNome = "Edson";
		n1.ultimoNome = "Angoti Jr";

		Nome n2 = new Nome();
		n2.primeiroNome = "Anna";
		n2.ultimoNome = "Godoy";

		Nome n3 = new Nome();
		n3.primeiroNome = "Arnaldo";
		n3.ultimoNome = "Antunes";

		Nome[] lista = new Nome[3];

		lista[0] = n1;
		lista[1] = n2;
		lista[2] = n3;

		request.setAttribute("x", lista);
		RequestDispatcher despacho = getServletContext().getRequestDispatcher("/ex2.jsp");
		despacho.forward(request, response);
	}

}
