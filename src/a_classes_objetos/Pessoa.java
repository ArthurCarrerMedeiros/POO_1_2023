package a_classes_objetos;

import javax.swing.JOptionPane;

public class Pessoa {
	private String nome;
	private double peso;
	private double altura;
	private char sexo;
	
	public void cadastrar() {
		nome = JOptionPane.showInputDialog("Informe o nome:");
		peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
		sexo = JOptionPane.showInputDialog("Sexo(M/F)").toUpperCase().charAt(0);
	}
	
	public double calculaImc() {
		return peso/(altura * altura);
	}
	
	public String exibirDados() {
		return nome + " - " + calculaImc() + " - " + avaliacao() + "\n";
	}
	
	public String avaliacao() {
		String avaliacao = "";
		double imc = calculaImc();
		
		if (sexo == 'M') {
			if (imc < 20.7) {
				avaliacao = "Abaixo do peso";
			} else if (imc >= 20.7 && imc < 26.4) {
				avaliacao = "Peso ideal";
			} else if (imc >= 26.5 && imc < 27.8) {
				avaliacao = "Pouco acima do peso";
			} else if (imc >= 27.9 && imc < 31.1) {
				avaliacao = "Acima do peso";
			} else {
				avaliacao = "Obesidade";
			}
		} else if (sexo == 'F') {
			if (imc < 19.1) {
				avaliacao = "Abaixo do peso";
			} else if (imc >= 19.1 && imc < 25.8) {
				avaliacao = "Peso ideal";
			} else if (imc >= 25.9 && imc < 27.3) {
				avaliacao = "Pouco acima do peso";
			} else if (imc >= 27.4 && imc < 32.3) {
				avaliacao = "Acima do peso";
			} else {
				avaliacao = "Obesidade";
			}
		}
		
		return avaliacao;
	}
	
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}
