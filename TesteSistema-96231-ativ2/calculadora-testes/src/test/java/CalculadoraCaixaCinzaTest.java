import br.edu.devfabrica.CalculadoraFacade;
import br.edu.devfabrica.CalculadoraService;
import br.edu.devfabrica.ResultadoOperacao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraCaixaCinzaTest {
    private final CalculadoraFacade facade = new CalculadoraFacade(new CalculadoraService());

    @Test
    void divisaoValidaRetornaStatus200(){
        ResultadoOperacao resposta = facade.dividir(10, 2);
        assertEquals (200, resposta.getStatus());
        assertEquals(5.0, resposta.getResultado());
        assertNull(resposta.getMensagem());
    }

    @Test
    void divisorZeroRetornaStatus400(){
        ResultadoOperacao resposta = facade.dividir(10, 0);
        assertEquals (400, resposta.getStatus());
        assertNull(resposta.getResultado());
        assertTrue (resposta.getMensagem().contains("Z ero"));
    }


}
