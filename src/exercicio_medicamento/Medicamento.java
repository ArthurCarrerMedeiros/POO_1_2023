package exercicio_medicamento;

import java.util.List;

public class Medicamento {
	private String nome;
	private String admin;
	private List<String> contraIndicacoes;
	private List<String> indicacoes;

	public Medicamento(){
	}

	public Medicamento(String nome, String admin, List<String> contraIndicacoes, List<String> indicacoes) {
		this.nome = nome;
		this.admin = admin;
		this.contraIndicacoes = contraIndicacoes;
		this.indicacoes = indicacoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public List<String> getContraIndicacoes() {
		return contraIndicacoes;
	}

	public void setContraIndicacoes(List<String> contraIndicacoes) {
		this.contraIndicacoes = contraIndicacoes;
	}

	public List<String> getIndicacoes() {
		return indicacoes;
	}

	public void setIndicacoes(List<String> indicacoes) {
		this.indicacoes = indicacoes;
	}
}
