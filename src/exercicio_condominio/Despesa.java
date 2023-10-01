package exercicio_condominio;

import javax.swing.*;
import java.util.List;
import java.util.stream.Collectors;

public class Despesa {
	private String descricao;
	private int ano;
	private int mes;
	private double valor;
	private double numeroApartamento;

	public Despesa() {
	}

	public Despesa(String descricao, int ano, int mes, double valor, double numeroApartamento) {
		this.descricao = descricao;
		this.ano = ano;
		this.mes = mes;
		this.valor = valor;
		this.numeroApartamento = numeroApartamento;
	}

	public static Despesa cadastrar(List<Apartamento> apartamentos) {
		Despesa despesa = null;
		String nome = JOptionPane.showInputDialog("Digite o nome da despesa: ");
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano da despesa?"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Qual o mês da despesa?"));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da despesa"));
		double numeroAp = Double.parseDouble(JOptionPane.showInputDialog("Qual o numero do apartamento da despesa"));
		
		List<Apartamento> apFiltrado = apartamentos.stream().filter(x -> x.getNumero() == numeroAp).toList();
		if (apFiltrado.size() == 1) {
			despesa = new Despesa(nome, ano, mes, valor, numeroAp);
			apFiltrado.get(0).getDespesas().add(despesa);
		}
		return despesa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getNumeroApartamento() {
		return numeroApartamento;
	}

	public void setNumeroApartamento(double numeroApartamento) {
		this.numeroApartamento = numeroApartamento;
	}
}
