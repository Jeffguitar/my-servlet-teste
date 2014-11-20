package contatos;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdicionaContatoServlet
 */
@WebServlet("/contatos")
public class ContatosServlet extends HttpServlet {
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {

		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String endereco = request.getParameter("endereco");
		String dataNascimento = request.getParameter("dataNascimento");

		Contatos c = null;
		Calendar Nascimento = null;

		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy")
					.parse(dataNascimento);
			Nascimento = Calendar.getInstance();
			Nascimento.setTime(date);

			c = new Contatos(nome, email, endereco, Nascimento);
			ListaContatos.adiciona(c);
		} catch (Exception e) {
			throw new ServletException(e);
		}

		if (c != null) {
			ListaContatos.adiciona(c);
		}

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><head><title>Contatos Adicionados</title></head></body>");
		out.write("<h1>Contatos Adicionados</h1><ol>");

		List<Contatos> list = ListaContatos.exibe();
		for (Contatos cont : list)
			out.write("<li><p>" + cont.getNome() + "</p></li>");

		out.write("</ol>");
		out.write("<p><hr /></p><p><a href='index.html'>Formulário de Cadastro</a>");
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ContatosServlet() {
		super();
		// TODO Auto-generated construct or stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
