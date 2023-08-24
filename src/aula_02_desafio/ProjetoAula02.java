package aula_02_desafio;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ProjetoAula02 {
	
	public static void main(String[] args) {
		String marca, corCarro;
		int anoFabricacao, opcao;
		String cor;
		List<Carro> listaCarros = new ArrayList<>();
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar um novo carro? \n1 - Sim\n2 - Não"));
				
		do {
			;
			
			marca = JOptionPane.showInputDialog("Qual a marca do carro?");
			anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de fabricação do carro?"));
			
			corCarro = JOptionPane.showInputDialog("Qual a cor do seu carro?").toUpperCase();
			Carro carro = new Carro();
			
			carro.cadastrarCarro(marca, anoFabricacao, corCarro);
			listaCarros.add(carro);
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar um novo carro? \n1 - Sim\n2 - Não"));
		} while (opcao == 1);
		
		listarCarros(listaCarros);
	} 

	public static void listarCarros(List<Carro> carros) {
		List<Carro> carrosOrdenados = carros.stream()
                    .sorted((car1, car2) -> Integer.compare(car1.getAnoFabricacao(), car2.getAnoFabricacao())).toList();
		
		for(int i=0; i<carrosOrdenados.size(); i++) {
			JOptionPane.showMessageDialog(null, carrosOrdenados.get(i));
		}
	}
}
