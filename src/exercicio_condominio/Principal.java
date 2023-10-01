package exercicio_condominio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		List<Condominio> condominios = new ArrayList<>();
		String condicao = JOptionPane.showInputDialog("Deseja cadastrar um novo condomínio?\nDigite S ou N").toUpperCase();

		if (condicao.equals("S")) {
			do {
				condominios.add(Condominio.cadastrar());
				condicao = JOptionPane.showInputDialog("Deseja cadastrar um novo condomínio\nDigite S ou N");
			} while(condicao.equals("S"));
		}

		if (!condominios.isEmpty()) {
			while(Integer.parseInt(JOptionPane.showInputDialog("Deseja consultar as despesas de um morador pelo nome?\n1 - Sim\n2 - Não")) == 1) {
				consultarDespesaMorador(condominios);
			}

			while(Integer.parseInt(JOptionPane.showInputDialog("Deseja consultar as despesas de um apartamento incluindo o ano e o mês da despesa?\n1 - Sim\n2 - Não")) == 1) {
				consultaDespesaApartamento(condominios);
			}

			if (Integer.parseInt(JOptionPane.showInputDialog("Deseja ver as despesas de todos os condomínios?\n1 - Sim\n2 - Não")) == 1) {
				for(Condominio condominio : condominios) {
					JOptionPane.showMessageDialog(null, condominio);
				}
			}
		}
	}

	public static void consultarDespesaMorador(List<Condominio> condominios) {
		List<Despesa> despesaMorador = new ArrayList<>();
		String nome = JOptionPane.showInputDialog("Digite o nome do morador: ");
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano que deseja procurar?"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Qual o mês que deseja procurar?"));

		for(Condominio condominio : condominios) {
			for(Apartamento ap : condominio.getApartamentos()) {
				if(ap.getMorador().getNome().equalsIgnoreCase(nome)) {
					despesaMorador.addAll(ap.getDespesas().stream().filter(x -> x.getAno() == ano && x.getMes() == mes).toList());
				}
			}
		}

		double totalDespesas = despesaMorador.stream().mapToDouble(Despesa::getValor).sum();
		JOptionPane.showMessageDialog(null, "O morador " + nome + " teve uma despesa total de R$" + totalDespesas);
	}

	public static void consultaDespesaApartamento(List<Condominio> condominios) {
		List<Despesa> despesas = new ArrayList<>();
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano que deseja procurar?"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Qual o mês que deseja procurar?"));
		double numeroAp = Double.parseDouble(JOptionPane.showInputDialog("Qual o numero do apartamento que deseja procurar?"));

		for(Condominio condominio : condominios) {
			despesas.addAll(condominio.getDespesas().stream().filter(x -> x.getNumeroApartamento() == numeroAp && x.getAno() == ano && x.getMes() == mes).toList());
		}

		if (!despesas.isEmpty()) {
			double totalDespesas = despesas.stream().mapToDouble(Despesa::getValor).sum();
			JOptionPane.showMessageDialog(null, "O total de gastos no período informado foi de R$" + totalDespesas);
		} else {
			JOptionPane.showMessageDialog(null, "Nenhuma despesa encontrada!");
		}
	}
}
