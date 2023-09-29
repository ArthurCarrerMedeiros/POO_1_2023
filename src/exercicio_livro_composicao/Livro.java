package exercicio_livro_composicao;

import javax.swing.*;

public class Livro {
	private String nome;
	private Autor autor;
	private Bibliotecario bibliotecario;

	public Livro() {
	}

	public Livro(String nome, Autor autor, Bibliotecario bibliotecario) {
		this.nome = nome;
		this.autor = autor;
		this.bibliotecario = bibliotecario;
	}

	public Livro cadastrar() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Bibliotecario getBibliotecario() {
		return bibliotecario;
	}

	public void setBibliotecario(Bibliotecario bibliotecario) {
		this.bibliotecario = bibliotecario;
	}
}
