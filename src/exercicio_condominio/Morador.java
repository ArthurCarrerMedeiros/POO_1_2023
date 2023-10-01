package exercicio_condominio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Morador {
	private String nome;

	public Morador() {
	}

	public Morador(String nome) {
		this.nome = nome;
	}

	public double mostrarDespesas(List<Apartamento> apartamentos, List<Despesa> despesas) {
		List<Despesa> despesasMorador = new ArrayList<>();
		apartamentos = apartamentos.stream().filter(x -> x.getMorador().getNome().equalsIgnoreCase(this.nome)).collect(Collectors.toList());

		for(Apartamento ap : apartamentos) {
			for(Despesa despesa : despesas) {
				if(despesa.getNumeroApartamento() == ap.getNumero()) {
					despesasMorador.add(despesa);
				}
			}
		}
		return despesasMorador.stream().mapToDouble(Despesa::getValor).sum();
	}

	public static Morador cadastrar() {
		String nome = JOptionPane.showInputDialog("Qual o nome do morador?");
		return new Morador(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
