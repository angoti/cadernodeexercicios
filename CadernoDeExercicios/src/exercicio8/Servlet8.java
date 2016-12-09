package exercicio8;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex8")
public class Servlet8 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Endereco e1 = new Endereco();
		e1.cep = "38400-000";
		e1.nomeCidade = "Uberlândia";
		e1.nomeRua = "Blanche Galassi";
		Nome n1 = new Nome();
		n1.primeiroNome = "Edson";
		n1.ultimoNome = "Angoti Jr";
		Funcionario f1 = new Funcionario();
		f1.endereco = e1;
		f1.nome = n1;

		Endereco e2 = new Endereco();
		e2.cep = "38500-000";
		e2.nomeCidade = "Uberaba";
		e2.nomeRua = "Major Eustáquio";
		Nome n2 = new Nome();
		n2.primeiroNome = "Anna";
		n2.ultimoNome = "Godoy";
		Funcionario f2 = new Funcionario();
		f2.endereco = e2;
		f2.nome = n2;

		Endereco e3 = new Endereco();
		e3.cep = "38600-000";
		e3.nomeCidade = "Tupaciguara";
		e3.nomeRua = "Rua das Couves";
		Nome n3 = new Nome();
		n3.primeiroNome = "Arnaldo";
		n3.ultimoNome = "Antunes";
		Funcionario f3 = new Funcionario();
		f3.endereco = e3;
		f3.nome = n3;
		Funcionario[] lista = new Funcionario[3];
		lista[0] = f1;
		lista[1] = f2;
		lista[2] = f3;
		request.setAttribute("x", lista);
		RequestDispatcher despacho = getServletContext().getRequestDispatcher("/ex8.jsp");
		despacho.forward(request, response);
	}

}
