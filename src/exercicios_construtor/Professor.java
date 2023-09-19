package exercicios_construtor;

import javax.swing.*;

public class Professor {
	private String nome;
	private String formacao;

	public Professor(){
	}

	public Professor(String nome, String formacao) {
		this.nome = nome;
		this.formacao = formacao;
	}

	public static Professor cadastrarProfessor() {
		String nome, formacao;
		int escolha;

		nome = JOptionPane.showInputDialog("Qual o nome do professor?");
		escolha = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua formação?\n1 - graduação, 2 - especialização, 3 - pós graduação"));
		formacao = retornaFormacao(escolha);
		return new Professor(nome, formacao);
	}

	public static String retornaFormacao(int formacao) {
		return formacao == 3? "Pós Graduação" : formacao == 2? "Especialização" : formacao == 1? "Graduação" : "Sem formação";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
}
