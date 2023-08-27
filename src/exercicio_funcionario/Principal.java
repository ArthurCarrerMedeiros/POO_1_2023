package exercicio_funcionario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Funcionario> listaFuncionarios = new ArrayList<>();

        JOptionPane.showMessageDialog(null, "Requisitos para contratação: \nIdade mínima de " + Funcionario.getIdadeMinima() + " anos");

        while (Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar um novo funcionário?\n1 - Sim\n2 - Não")) == 1) {
            String nome;
            int idade;
            Funcionario funcionario = new Funcionario();

            nome = JOptionPane.showInputDialog("Digite o nome do funcionário: ");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do funcionário?"));

            if (!listaFuncionarios.isEmpty()) {
                boolean contratadoAnteriormente = false;

                for (Funcionario func : listaFuncionarios) {
                    if (func.getNome().equalsIgnoreCase(nome)) {
                        contratadoAnteriormente = true;
                        break;
                    }
                }

                if (contratadoAnteriormente) {
                    JOptionPane.showMessageDialog(null,"O funcionário digitado já está cadastrado na empresa!");
                    continue;
                }
            }

            funcionario.contratar(nome, idade);
            listaFuncionarios.add(funcionario);
        }

        JOptionPane.showMessageDialog(null, "O total de funcionários na empresa são de " + Funcionario.getTotalFuncionarios() + " funcionários");
    }
}
