import br.edu.devfabrica.CalculadoraService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraCaixaPretaTest {
    private final CalculadoraService calc = new CalculadoraService();
    @Test
    void somaDoisPositivos() {
        assertEquals(15, calc.somar(10,5));
    }
    @Test
    void somaPositivoENegativo() {
        assertEquals(5, calc.somar(10,-5));
    }
    @Test
    void subtracaoComResultadoNegativo() {
        assertEquals(-5, calc.subtrair(10,15));
    }
    @Test
    void multiplicacaoPorZero() {
        assertEquals(0, calc.multiplicar(10,0));
    }
    @Test
    void divisaoComResultadoDecimal(){
        assertEquals(2.5, calc.dividir(5,2),0.000001);
    }
    @Test
    void divisorZeroDeveSerRejeitado(){
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(10,0));
    }

}
