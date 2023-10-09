package exercicio_contas;

public class Conta implements OperacoesConta {
	protected double numero;
	protected String agencia;
	protected String nomeCorrentista;
	protected double saldo;


	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void saque(double valor) throws SaldoException {
		verificaSaldo(valor);
		this.saldo -= valor;
	}

	@Override
	public void transferencia(double valor, Conta conta) throws SaldoException {
		verificaSaldo(valor);
		this.saldo -= valor;
		conta.saldo += valor;
	}

	public void verificaSaldo(double valor) throws SaldoException {
		if (this.saldo - valor < 0) {
			throw new SaldoException();
		}
	}
}
