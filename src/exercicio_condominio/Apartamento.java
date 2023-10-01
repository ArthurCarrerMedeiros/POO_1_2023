package exercicio_condominio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Apartamento {
	private int numero;
	private double tamanho;
	private Morador morador;
	private final double TAXA = 5 * tamanho;
	private List<Despesa> despesas;

	public Apartamento() {
		this.despesas = new ArrayList<>();
	}

	public Apartamento(int numero, double tamanho, Morador morador) {
		this.despesas = new ArrayList<>();
		this.numero = numero;
		this.tamanho = tamanho;
		this.morador = morador;
	}

	public static Apartamento cadastrar() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Qual o número do apartamento?"));
		double tamanho = Double.parseDouble(JOptionPane.showInputDialog("Qual o tamanho do apartamento em metros quadrados?"));
 		Morador morador = Morador.cadastrar();
		return new Apartamento(numero, tamanho, morador);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public Morador getMorador() {
		return morador;
	}

	public void setMorador(Morador morador) {
		this.morador = morador;
	}

	public double getTAXA() {
		return TAXA;
	}

	public List<Despesa> getDespesas() {
		return despesas;
	}

	public void setDespesas(List<Despesa> despesas) {
		this.despesas = despesas;
	}
}
