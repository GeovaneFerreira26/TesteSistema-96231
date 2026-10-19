import br.edu.devfabrica.CalculadoraService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraCaixaBrancaTest {
    private final CalculadoraService calc = new CalculadoraService();

    @Test
    void decisaoVerdadeiraDivisorZero(){
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(10,0));
    }

    @Test
    void decisaoFalsaDivisorDiferenteDeZero(){
        assertEquals(5.0, calc.dividir(10,2),0.000001);
    }

}
