package exercicio_condominio;

import javax.swing.*;

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

	public static Despesa cadastrar() {
		String nome = JOptionPane.showInputDialog("Digite o nome da despesa: ");
		int ano = Integer.parseInt("Qual o ano da despesa?");
		int mes = Integer.parseInt("Qual o mês da despesa?");
		double valor = Double.parseDouble("Qual o valor da despesa");
		double numeroAp = Double.parseDouble("Qual o numero do apartamento da despesa");
		return new Despesa(nome, ano, mes, valor, numeroAp);
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
