package projeto.login;

public class App {



    private App(){
    }
    public static void main(String[] args){
        ValidarSenha password = new ValidarSenha();
        ValidarEmail email = new ValidarEmail();
        ValidarNome nome = new ValidarNome();

        System.out.println("Validações");
        System.out.println("Status: " + password.validarSenha("querty$123"));
        System.out.println("Status: " + email.validarEmail("gegeka@gmail.com"));
        System.out.println("Status: " + nome.validarNome("Geovane Ferreira"));

    }


}
