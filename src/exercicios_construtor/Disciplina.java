package exercicios_construtor;

public class Disciplina {
	public String nome;
	public double cargaHoraria;
	public Professor professor;

	public Disciplina(){
	}

	public Disciplina(String nome, double cargaHoraria, Professor professor) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.professor = professor;
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
}
