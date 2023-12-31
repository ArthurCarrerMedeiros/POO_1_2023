package exercicio_condominio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Condominio {
	private String nome;
	List<Apartamento> apartamentos;
	List<Despesa> despesas;

	public Condominio() {
	}

	public Condominio(String nome, List<Apartamento> apartamentos, List<Despesa> despesas) {
		this.nome = nome;
		this.apartamentos = apartamentos;
		this.despesas = despesas;
	}

	public static Condominio cadastrar() {
		List<Apartamento> apartamentos = new ArrayList<>();
		List<Despesa> despesas = new ArrayList<>();

		String nome = JOptionPane.showInputDialog("Digite o nome do condomínio: ");
		while(Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar um novo apartamento?\n1 - Sim\n2 - Não")) == 1) {
			apartamentos.add(Apartamento.cadastrar());
		}

		while(Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar uma nova despesa?\n1 - Sim\n2 - Não")) == 1) {
			despesas.add(Despesa.cadastrar(apartamentos));
		}
		return new Condominio(nome, apartamentos, despesas);
	}

	public List<Apartamento> getApartamentos() {
		return apartamentos;
	}

	public void setApartamentos(List<Apartamento> apartamentos) {
		this.apartamentos = apartamentos;
	}

	public List<Despesa> getDespesas() {
		return despesas;
	}

	public void setDespesas(List<Despesa> despesas) {
		this.despesas = despesas;
	}

	@Override
	public String toString() {
		double totalDespesas = 0;
		totalDespesas = despesas.stream().mapToDouble(Despesa::getValor).sum();
		return "Condominio " + this.nome + "\nTotal despesas R$" + totalDespesas;
	}
}
