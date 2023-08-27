package exercicio_funcionario;

import javax.swing.*;

public class Funcionario {
    private String nome;
    private int idade;
    private static int totalFuncionarios;
    private final static int idadeMinima = 18;

    public void contratar(String nome, int idade) {
        if(idade < idadeMinima) {
            JOptionPane.showMessageDialog(null, "O funcionário não pode ser contratado, pois a idade é inferior a idade mínima que é " + idadeMinima + " anos");
            return;
        }

        setNome(nome);
        setIdade(idade);
        totalFuncionarios += 1;
        JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
    }

    public static int getIdadeMinima() {
        return idadeMinima;
    }

    public static int getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
