package br.edu.devfabrica;

public class ResultadoOperacao {
    private final int status;
    private final Double resultado;
    private final String mensagem;

    public ResultadoOperacao(int status, Double resultado, String mensagem) {
        this.status = status;
        this.resultado = resultado;
        this.mensagem = mensagem;
    }

    public int getStatus() {
        return status;
    }

    public Double getResultado() {
        return resultado;
    }

    public String getMensagem() {
        return mensagem;
    }
}
