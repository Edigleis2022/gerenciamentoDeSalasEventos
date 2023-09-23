package br.com.ifms.projeto.gerenciamento.evento.crud.Associado;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Associado {
    
    //Atributo
    private Integer cpf;
    private String nome;
    private Integer quadraLote;

    //Get e Set
    public Integer getCpf() {
        return cpf;
    }
    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getQuadraLote() {
        return quadraLote;
    }
    public void setQuadraLote(Integer quadraLote) {
        this.quadraLote = quadraLote;
    }

    

}
