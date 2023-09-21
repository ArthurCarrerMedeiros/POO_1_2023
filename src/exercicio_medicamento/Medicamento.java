package exercicio_medicamento;
import java.util.List;

public class Medicamento {
	private String nome;
	private String administracao;
	private List<String> contraindicacoes;
	private List<String> indicacoes;

	public Medicamento(String nome, String administracao, List<String> contraindicacoes, List<String> indicacoes) {
		this.nome = nome;
		this.administracao = administracao;
		this.contraindicacoes = contraindicacoes;
		this.indicacoes = indicacoes;
	}

	public String getNome() {
		return nome;
	}

	public String getAdministracao() {
		return administracao;
	}

	public List<String> getContraindicacoes() {
		return contraindicacoes;
	}

	public List<String> getIndicacoes() {
		return indicacoes;
	}
}