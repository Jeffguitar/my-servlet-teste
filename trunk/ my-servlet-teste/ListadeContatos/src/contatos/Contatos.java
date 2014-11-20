package contatos;

import java.util.Calendar;

public class Contatos {

	private String nome;
	private String email;
	private String endereco;
	private Calendar dataNascimento;

	public Contatos(String nome, String email, String endereco,
			Calendar dataNascimento) {
		this.setNome(nome);
		this.setEmail(email);
		this.setEndereco(endereco);
		this.setDataNascimento(dataNascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
