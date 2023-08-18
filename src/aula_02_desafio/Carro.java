package aula_02_desafio;

public class Carro {
	private String marca;
	private int anoFabricacao;
	private Cor cor;
	
	public void cadastrarCarro(String marca, int anoFabricacao, Cor cor) {
		this.marca = marca;
		this.anoFabricacao = anoFabricacao;
		this.cor = cor;
	}
	
	public String getMarca() {
		return marca;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public Cor getCor() {
		return cor;
	}
	
	public Carro(String marca, int anoFabricacao, Cor cor) {
		super();
		this.marca = marca;
		this.anoFabricacao = anoFabricacao;
		this.cor = cor;
	}
}
