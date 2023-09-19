package exercicios_construtor;

import javax.swing.*;

public class Disciplina {
	public String nome;
	public double cargaHoraria;
	public Professor professor;
	public double[] notas = new double[3];

	public Disciplina(){
	}

	public Disciplina(String nome, double cargaHoraria, Professor professor, double[] notas) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.professor = professor;
		this.notas = notas;
	}

	public static Disciplina cadastrarDisciplina() {
		String nome;
		double cargaHoraria;
		double[] notas;
		Professor professor = new Professor();

		nome = JOptionPane.showInputDialog("Qual o nome da disciplina?");
		cargaHoraria = Double.parseDouble(JOptionPane.showInputDialog("Qual a carga horária da disciplina?"));

		if (Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar um professor para a disciplina?\n1 - Sim\n2 - Não")) == 1) {
			professor = Professor.cadastrarProfessor();
		}

		notas = cadastrarNotas();

		return new Disciplina(nome, cargaHoraria, professor, notas);
	}

	public static double[] cadastrarNotas() {
		double[] notas = new double[3];

		notas[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota da disciplina: "));
		notas[1] = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota da disciplina: "));
		notas[2] = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota da disciplina: "));
		return notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
}
