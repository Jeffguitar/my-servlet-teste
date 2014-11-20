package contatos;

import java.util.ArrayList;
import java.util.List;

public class ListaContatos {
	private static List<Contatos> contatos = new ArrayList<Contatos>();

	public static void adiciona(Contatos contato) {
		contatos.add(contato);
	}

	public static List<Contatos> exibe() {
		return contatos;
	}
}
