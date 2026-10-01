import org.junit.Test;
import projeto.login.ValidarNome;
import projeto.login.ValidarSenha;
import projeto.login.ValidarEmail;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidarSenhaServiceTest {
    private ValidarSenha service = new ValidarSenha();
    @Test
    public void deveAceitarSenhaValida() {
        String senha = "Querty$199";
        boolean resultado =  service.validarSenha(senha);
        assertTrue(resultado);
    }

    private ValidarEmail usuario = new ValidarEmail();
    @Test
    public void deveAceitarEmailValido(){
        String user = "gegeka@gmail.com";
        boolean resultado = usuario.validarEmail(user);
        assertTrue(resultado);
    }
    private ValidarNome nome = new ValidarNome();
    @Test
    public void deveAceitarNomeValido(){
        String nomevalido = "Geovane Ferreira";
        boolean resultado = nome.validarNome(nomevalido);
        assertTrue(resultado);
    }
}
