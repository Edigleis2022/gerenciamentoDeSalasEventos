package br.com.ifms.projeto.gerenciamento.evento.crud.Associado;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class Associado {
    
    //Atributo
    private String cpf;
    private String nome;
    private String quadraLote;

    //Get e Set
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
