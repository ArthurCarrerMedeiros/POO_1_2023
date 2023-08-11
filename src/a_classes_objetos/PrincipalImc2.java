package a_classes_objetos;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class PrincipalImc2 {
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		
		String menu = "1 - Cadastrar\n"
				+ "2 - Listar\n"
				+ "3 - Sair";
		
		int op = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if (op == 1) {
				Pessoa p = new Pessoa();
				p.cadastrar();
				pessoas.add(p);
				
			} else if(op == 2) {
				String result = "Pessoas cadastradas\n\n";
				
				for(Pessoa pessoa : pessoas) {
					result += pessoa.exibirDados();
				}
				
				JOptionPane.showMessageDialog(null, result);
			} 
			
		} while (op != 3);
	}
}
