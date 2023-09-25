package br.com.ifms.projeto.gerenciamento.evento.crud.Reserva;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "reservas")
public class Reserva {
    
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
