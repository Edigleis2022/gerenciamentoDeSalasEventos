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
    private int condigo;
    private String cpf;
    private String nome;
    private String quadraLote;

    // Get e Set
    public int getCondigo() {
        return condigo;
    }

    
    public void setCondigo(int condigo) {
        this.condigo = condigo;
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
