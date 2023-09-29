package exercicio_condominio;

import javax.swing.*;

public class Apartamento {
	private int numero;
	private double tamanho;
	private Morador morador;
	private final double TAXA = 5 * tamanho;

	public Apartamento() {
	}

	public Apartamento(int numero, double tamanho, Morador morador) {
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
}
