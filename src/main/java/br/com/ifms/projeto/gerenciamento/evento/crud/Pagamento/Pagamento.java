package br.com.ifms.projeto.gerenciamento.evento.crud.Pagamento;

public class Pagamento {
    private String cartao;
    private String boleto;
    private String pix;

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getBoleto() {
        return boleto;
    }

    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }

    public String getPix() {
        return pix;
    }
    
    public void setPix(String pix) {
        this.pix = pix;
    }
    
}
