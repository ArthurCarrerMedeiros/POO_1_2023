package exercicio_time;

import javax.swing.JOptionPane;

public class Jogador {
	private String nome;
	private int camisa;
	private int gols;
	
	void cadastrar() {
		setNome(JOptionPane.showInputDialog("Informe o nome do jogador:"));
		setCamisa(Integer.parseInt(JOptionPane.showInputDialog("Informe a camisa do jogador:")));
		setGols(Integer.parseInt(JOptionPane.showInputDialog("Informe os gols feitos pelo jogador:")));
	}
	
	String exibir() {
		return "O jogador " + getNome() + " - Camisa número " + getCamisa() + " - Saldo de gols " + getGols() + "\n";
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCamisa() {
		return camisa;
	}
	
	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}
	
	public int getGols() {
		return gols;
	}
	
	public void setGols(int gols) {
		this.gols = gols;
	}
}
