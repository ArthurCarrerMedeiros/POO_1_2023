package exercicio_time;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Time time = new Time();
		time.cadastrar();
		
		JOptionPane.showMessageDialog(null, time.exibir());
		time.artilheiroTime();
	}
}
