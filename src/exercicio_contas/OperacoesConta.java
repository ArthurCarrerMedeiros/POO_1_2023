package exercicio_contas;

public interface OperacoesConta {
	void depositar(double valor);
	void saque(double valor) throws SaldoException;
	void transferencia(double valor, Conta conta) throws SaldoException;
	void verificaSaldo(double valor) throws SaldoException;
}
