package exercicios_construtor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private List<Disciplina> disciplinas;

	public Aluno(){
	}

	public Aluno(String nome, List<Disciplina> disciplinas) {
		this.nome = nome;
		this.disciplinas = disciplinas;
	}

	public static Aluno cadastrarAluno() {
		int escolha;
		String nome;
		List<Disciplina> disciplinas = new ArrayList<>();

		nome = JOptionPane.showInputDialog("Qual o nome do aluno?");

		while(Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar uma disciplina para o aluno?\n1 - Sim\n2 - Não")) == 1) {
			disciplinas.add(Disciplina.cadastrarDisciplina());
		}

		return new Aluno(nome, disciplinas);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
}
