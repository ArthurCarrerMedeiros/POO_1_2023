package exercicio_condominio;

import javax.swing.*;

public class Morador {
	private String nome;

	public Morador() {
	}

	public Morador(String nome) {
		this.nome = nome;
	}

	public static Morador cadastrar() {
		String nome = JOptionPane.showInputDialog("Qual o nome do morador?");
		return new Morador(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
