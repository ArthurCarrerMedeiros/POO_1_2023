package a_classes_objetos;

import javax.swing.JOptionPane;

public class Principalmc1 {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de pessoas?"));
		
		Pessoa pessoas[] = new Pessoa[n];
		
		String resultado = "";
		
		for(int i=0; i<n; i++) {
			Pessoa p = new Pessoa();
			p.cadastrar();
			pessoas[i] = p;
			resultado += p.exibirDados();
		}
		
		JOptionPane.showMessageDialog(null, resultado);
	}
}
