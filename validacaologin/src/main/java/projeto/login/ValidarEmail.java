package projeto.login;

public class ValidarEmail {
    public boolean validarEmail (String email){
        if (email == null || email.isBlank()){
            return false;
        }
        boolean possuiarrouba =
                email.matches(".*[ @ ].*");
        return possuiarrouba;
    }


}
