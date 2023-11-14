package br.com.ifms.projeto.gerenciamento.evento.crud.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "reservas")
public class Reserva {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date data;
    private String nome;
    private Double valor;
    private String periodo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getPeriodo() {
        return periodo;
    }
    
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
}
