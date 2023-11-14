package br.com.ifms.projeto.gerenciamento.evento.crud.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pagamentos")

public class Pagamento {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cartao;
    private String boleto;
    private String pix;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
