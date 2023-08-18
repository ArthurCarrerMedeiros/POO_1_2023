package aula_02_desafio;

import java.util.List;

import javax.swing.JOptionPane;

public class ProjetoAula02 {
	
	public static void main(String[] args) {
		String marca, corCarro;
		int anoFabricacao, opcao;
		Cor cor;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar um novo carro? \n1 - Sim\n2 - Não"));
			
			marca = JOptionPane.showInputDialog("Qual a marca do carro?");
			anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de fabricação do carro?"));
			
			
			String[] opcoes = new String[Cor.values().length];
			
			for(int i=0; i< Cor.values().length; i++) {
				opcoes[i] = Cor.values()[i].toString();
			}
			
			corCarro = (String) JOptionPane.showInputDialog(null, "Escolha a cor do carro", "Escolha a cor", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]));
		} while (opcao == 1);
		
	} 

	public static void listarCarros(List<Carro> carros) {
		List<Carro> carrosOrdenados = carros.stream()
                    .sorted((car1, car2) -> Integer.compare(car1.getAnoFabricacao(), car2.getAnoFabricacao())).toList();
	}
}
