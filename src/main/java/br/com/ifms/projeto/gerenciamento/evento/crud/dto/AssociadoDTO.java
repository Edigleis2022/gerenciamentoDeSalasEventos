package br.com.ifms.projeto.gerenciamento.evento.crud.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import br.com.ifms.projeto.gerenciamento.evento.crud.entities.Associado;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PastOrPresent;

public class AssociadoDTO implements Serializable {
    private static  final long serialVersionUID = 1L;

    private Long id;
    @Size(min = 5, max = 100, message = "Deve ter entre 5 a 20 caracteres")
    @NotBlank(message = "Campo obrigatório")
    private String nome;
    private Integer idade;
    @PastOrPresent(message = "A data não deve ser futura")
    private LocalDate dataNascimento;
    private String telefone;
    @Email(message = "Entrar com um email válido")
    private String email;   
    private String endereco;

    private Set<RoleDTO> roles = new HashSet<>();

    


    public AssociadoDTO{
        //TODO Auto-generated constructor stub
    }

    public AssociadoDTO(Long id, String nome, Integer idade, LocalDate dataNascimento, String telefone, String email,
    String endereco){
        this.id = id;
        this.nome =  nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    private String CPF;
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }   
 
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnderenco() {
        return endereco;
    }
    public void setEnderenco(String enderenco) {
        this.endereco = enderenco;
    }

    public Set<RoleDTO> getRoles(){
        return roles;
    }

}
