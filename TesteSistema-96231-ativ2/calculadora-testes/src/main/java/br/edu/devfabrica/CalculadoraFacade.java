package br.edu.devfabrica;

public class CalculadoraFacade {
    private final CalculadoraService service;
    public CalculadoraFacade(CalculadoraService service){
        this.service = service;
    }

    public ResultadoOperacao dividir(double a, double b){
        try {
            return new ResultadoOperacao(
                    200, service.dividir(a,b), null);
        } catch (IllegalArgumentException ex){
            return new ResultadoOperacao(400, null, ex.getMessage());
        }
    }
}
