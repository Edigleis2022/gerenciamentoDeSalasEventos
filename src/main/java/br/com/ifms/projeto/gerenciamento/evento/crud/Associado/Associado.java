package br.com.ifms.projeto.gerenciamento.evento.crud.Associado;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "associados")
public class Associado {

    // Atributo
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    

    private String cpf;
    private String nome;
    private String quadraLote;

    // Get e Set
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuadraLote() {
        return quadraLote;
    }

    public void setQuadraLote(String quadraLote) {
        this.quadraLote = quadraLote;
    }

}
