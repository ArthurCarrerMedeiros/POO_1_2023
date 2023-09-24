package exercicio_medicamento;

import javax.swing.*;
import java.util.List;

public class Pessoa {
	private String nome;
	private String sintoma;
	private List<String> condSaude;
	private List<Medicamento> medicamentos;

	public Pessoa() {
	}

	public Pessoa(String nome, String sintoma, List<String> condSaude, List<Medicamento> medicamentos) {
		this.nome = nome;
		this.sintoma = sintoma;
		this.condSaude = condSaude;
		this.medicamentos = medicamentos;
	}

	public static void cadastrar() {
		JOptionPane.showInputDialog("Digite o nome do paciente: ");

	}

	public static void cadastrarSintoma() {
		JOptionPane.showInputDialog("Deseja ")
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSintoma() {
		return sintoma;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

	public List<String> getCondSaude() {
		return condSaude;
	}

	public void setCondSaude(List<String> condSaude) {
		this.condSaude = condSaude;
	}

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}
}
