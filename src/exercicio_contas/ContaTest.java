package exercicio_contas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaTest {
    @Test
    void depositarTeste() {
        Conta c = new Conta();
        c.depositar(2000.00);
        assertEquals(c.getSaldo(), 2000.00);
    }
}