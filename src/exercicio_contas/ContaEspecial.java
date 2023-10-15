package exercicio_contas;

import javax.swing.*;

public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(double limite) {
		this.limite = limite;
	}

	public ContaEspecial(double numero, String agencia, String nomeCorrentista, double saldo, double limite) {
		super(numero, agencia, nomeCorrentista, saldo);
		this.limite = limite;
	}

	public void cadastrarLimite() {
		limite = Double.parseDouble(JOptionPane.showInputDialog("Insira um limite para saques: "));
	}

	public void verificarLimite(double valor) throws LimiteException {
		if(valor > limite) {
			throw new LimiteException();
		}
	}

	@Override
	public void saque(double valor) throws SaldoException, LimiteException {
		super.verificaSaldo(valor);
		verificarLimite(valor);
		this.saldo -= valor;
	}

	@Override
	public void transferencia(double valor, Conta conta) throws SaldoException, LimiteException {
		verificaSaldo(valor);
		verificarLimite(valor);
		this.saldo -= valor;
		conta.saldo += valor;
	}
}
