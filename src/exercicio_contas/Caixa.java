package exercicio_contas;

import javax.swing.*;

public class Caixa {
	public static void depositar(Conta conta, double valor) {
		conta.depositar(valor);
	}

	public static void saque(Conta conta, double valor) throws SaldoException, LimiteException {
		conta.saque(valor);
	}

	public static void transferencia(double valor, Conta conta) throws SaldoException, LimiteException {
		conta.transferencia(valor, conta);
	}
}
