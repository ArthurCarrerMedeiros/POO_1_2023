package exercicio_contas;

public class SaldoException extends Exception {
	public SaldoException() {
		super("Saldo insuficiente, favor depositar!");
	}
}
