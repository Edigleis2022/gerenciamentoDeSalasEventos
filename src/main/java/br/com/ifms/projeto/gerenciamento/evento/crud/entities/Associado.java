package br.com.ifms.projeto.gerenciamento.evento.crud.entities;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.JoinColumn;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;


/*Primeira annotecion
 * Entity cria a tabela no bancos de dados
 * 
 */
@Entity
@Table(name = "associados")
public class Associado implements Serializable{
    private static final long serialVersionUID = 1l;

    // Atributos
    // O Id é responsavel pela criação da primary ky
    @Id
    //Essa annotecion 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer idade; 
    private String cpf;
    private LocalDate dataNascimento;
    private String quadraLote;
	private String telefone;
    private String email;
	private String endereco;

    @ManyToAny(fetch = FetchType.EAGER)
    @JoinTable(name = "tb_associado_role",
                    joinColumns = @JoinColumn(name = "associado_id"),
                    inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public Associado(){
        
    }

 public Associado(Long id, String name, String CPF, LocalDate dataNascimento, String telefone, String email,
			String endereco) {
		this.id = id;
		this.name = name;
		this.cpf = CPF;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}


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
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getQuadraLote() {
        return quadraLote;
    }

    public void setQuadraLote(String quadraLote) {
        this.quadraLote = quadraLote;
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


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    @Override
    public boolean equals(Object obj){
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }   
            Associado other =(Associado) obj;
            return Objects.equals(id, other.id);
    }

}
