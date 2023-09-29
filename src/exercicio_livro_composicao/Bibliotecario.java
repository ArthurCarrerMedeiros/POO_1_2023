package exercicio_livro_composicao;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Bibliotecario {
	private String nome;
	private List<Livro> livrosBibliotecario;

	public Bibliotecario() {
		this.livrosBibliotecario = new ArrayList<Livro>();
	}

	public Bibliotecario(String nome) {
		this.nome = nome;
		this.livrosBibliotecario = new ArrayList<Livro>();
	}

	public void cadastrarLivro(final String nome, final Autor autor) {
		livrosBibliotecario.add(new Livro(nome, autor, this));
	}
}