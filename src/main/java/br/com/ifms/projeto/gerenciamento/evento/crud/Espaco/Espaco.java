package br.com.ifms.projeto.gerenciamento.evento.crud.Espaco;

public class Espaco {
    
    private String salao;
    private Double valor;
    private String quiosque;
    private String quadraEsportiva;


    public String getSalao() {
        return salao;
    }

    public void setSalao(String salao) {
        this.salao = salao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getQuiosque() {
        return quiosque;
    }

    public void setQuiosque(String quiosque) {
        this.quiosque = quiosque;
    }

    public String getQuadraEsportiva() {
        return quadraEsportiva;
    }
    
    public void setQuadraEsportiva(String quadraEsportiva) {
        this.quadraEsportiva = quadraEsportiva;
    }
}
