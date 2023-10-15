package exercicio_contas;

public class LimiteException extends Exception {
	public LimiteException() {
		super("Valor maior que o limite pré-definido!");
	}
}
