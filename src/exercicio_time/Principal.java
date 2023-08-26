package exercicio_time;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		List<Time> listaTimes = new ArrayList<>();

		while (Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar um novo time?\n1 - Sim\n2 - Não")) == 1) {
			Time time = new Time();
			time.cadastrar();

			if (Integer.parseInt(JOptionPane.showInputDialog("Deseja listar os jogadores do time?\n1 - Sim\n2 - Não")) == 1) {
				JOptionPane.showMessageDialog(null, time.exibir());
			}

			if (Integer.parseInt(JOptionPane.showInputDialog("Deseja verificar o artilheiro do time?\n1 - Sim\n2 - Não")) == 1) {
				JOptionPane.showMessageDialog(null, time.artilheiroTime().exibir());
			}

			listaTimes.add(time);
		}

		if (Integer.parseInt(JOptionPane.showInputDialog("Deseja encontrar o time com mais gols?\n1 - Sim\n2 - Não")) == 1) {
			JOptionPane.showMessageDialog(null, melhorTime(listaTimes));
		}
	}
	public static String melhorTime(List<Time> time) {
        int gols = 0;
        int golsTime = 0;
		String melhorTime = "";

        for (Time t : time) {
            golsTime = t.getGolsTime();

            if (golsTime > gols) {
                gols = golsTime;
                melhorTime = t.getNome();
            }
        }

        return "O time com mais gols foi o time: " + melhorTime + " com um total de " + gols + " gols";
    }
}
