package exercicio_livro_composicao;

import java.util.List;

public class Autor {
	private String nome;
	private List<Livro> livrosAutor;

	public Autor() {
	}

	public Autor(String nome, List<Livro> livrosAutor) {
		this.nome = nome;
		this.livrosAutor = livrosAutor;
	}
}
