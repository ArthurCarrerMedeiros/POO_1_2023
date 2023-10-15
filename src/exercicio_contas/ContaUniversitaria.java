package exercicio_contas;

import javax.swing.*;

public class ContaUniversitaria extends Conta {
	public ContaUniversitaria() {
		super();
	}

	public ContaUniversitaria(double numero, String agencia, String nomeCorrentista, double saldo) {
		super(numero, agencia, nomeCorrentista, saldo);
	}

	public boolean verificarSaldo(double saldo) {
		if(saldo > 2000) {
			JOptionPane.showMessageDialog(null,"Saldo máximo permitido é de R$2000.00");
			return false;
		}
		return true;
	}

	@Override
	public void depositar(double valor) {
		if(!verificarSaldo(this.saldo + valor)) {
			return;
		}
		this.saldo += valor;
	}

	public void transferencia(double valor, Conta conta) throws SaldoException, LimiteException {
		super.verificaSaldo(valor);

		if (!verificarSaldo(this.saldo + valor)) {
			return;
		}

		this.saldo -= valor;
		conta.saldo += valor;
	}
}
