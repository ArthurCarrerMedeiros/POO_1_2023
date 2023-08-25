package exercicio_time;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Time {
	private String nome;
	private List<Jogador> jogadores = new ArrayList<>();
	
	public void cadastrar() {
		setNome(JOptionPane.showInputDialog("Informe o nome do time"));
		String continua = "";
		
		do {
			Jogador j = new Jogador();
			j.cadastrar();
			jogadores.add(j);
			continua = JOptionPane.showInputDialog("Deseja cadastrar mais jogadores? S/N").toUpperCase();
			
		} while(continua.equalsIgnoreCase("S"));
	}
	
	public String exibir() {
		String dados = "*** " + getNome() + "***\n";
		
		for(Jogador j: jogadores) {
			dados += j.exibir();
		}
		
		return dados;
	}
	
	public Jogador artilheiroTime() {
		Jogador art = jogadores.get(0);
		
		for(Jogador j : jogadores) {
			if(j.getGols() > art.getGols()) {
				art = j;
			}
		}
		
		return art;
	}
	
	public int getGolsTime() {
		int gols = 0;
		for(Jogador j : jogadores) {
			gols += j.getGols();
		}
		
		return gols;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
}
