package aula_02_desafio;

public class Carro {
	private String marca;
	private int anoFabricacao;
	private String cor;
	
	public Carro() {
	}
	
	public Carro(String marca, int anoFabricacao, String cor) {
		super();
		this.marca = marca;
		this.anoFabricacao = anoFabricacao;
		this.cor = cor;
	}
	
	public void cadastrarCarro(String marca, int anoFabricacao, String cor) {
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
	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", anoFabricacao=" + anoFabricacao + ", cor=" + cor + "]";
	}
}
