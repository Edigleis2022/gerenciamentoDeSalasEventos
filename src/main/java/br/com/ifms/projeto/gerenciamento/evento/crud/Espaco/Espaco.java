package br.com.ifms.projeto.gerenciamento.evento.crud.Espaco;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "espacos")
public class Espaco {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String salao;
    private Double valor;
    private String quiosque;
    private String quadraEsportiva;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
