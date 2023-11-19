package br.com.ifms.projeto.gerenciamento.evento.crud.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "espacos")
public class Espaco implements Serializable {
        private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String salao;
    private String quiosque;
    @Enumerated(EnumType.STRING)
    private String quadraEsportiva;

    @OneToMany(mappedBy = "espaco", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<EspacoItem> espacoItem;

    public Espaco(){
        //TODO Auto-generated constructor stub
    }

    public Espaco(Long id, String salao, String quiosque, String quadraEsportiva,
                List<Espaco> espacoItem){
            
            this.id = id;
            this.salao = salao;
            this.quiosque = quiosque;
            this.quadraEsportiva = quadraEsportiva;
    }

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

    @Override
    public int hashCode(){
            return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
                return true;
        }
        if (obj == null) {
                return false;
        }
        if (getClass() != obj.getClass()) {
                return false;
        }
        Espaco other = (Espaco) obj;
        return Objects.equals(id, other.id);
    }

}
