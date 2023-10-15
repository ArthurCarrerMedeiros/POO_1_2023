package exercicio_contas;

public interface OperacoesConta {
	void depositar(double valor);
	void saque(double valor) throws SaldoException, LimiteException;
	void transferencia(double valor, Conta conta) throws SaldoException, LimiteException;
	void verificaSaldo(double valor) throws SaldoException;
}
