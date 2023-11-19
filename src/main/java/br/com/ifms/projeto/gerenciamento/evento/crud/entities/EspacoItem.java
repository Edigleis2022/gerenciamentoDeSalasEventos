package br.com.ifms.projeto.gerenciamento.evento.crud.entities;

import java.io.Serializable;
import java.util.Objects;

import br.com.ifms.projeto.gerenciamento.evento.crud.entities.enums.Situacao;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_espaco_item")
public class EspacoItem implements Serializable {
        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String numeroSerie;
        
        @Enumerated(EnumType.STRING)
        private Situacao situacao;

        @ManyToOne
        @JoinColumn(name = "id_equipamento_fk")
        private Espaco espaco;

        public EspacoItem(){
            //TODO Auto-generated constructor stub
        }

        public EspacoItem(Long id, String numeroSerie, Situacao situacao){
            this.id = id;
            this.numeroSerie = numeroSerie;
            this.situacao = situacao;
        } 
        
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNumeroSerie() {
            return numeroSerie;
        }

        public void setNumeroSerie(String numeroSerie) {
            this.numeroSerie = numeroSerie;
        }
        
        public Situacao getSituacao() {
            return situacao;
        }

        public void setSituacao(Situacao situacao) {
            this.situacao = situacao;
        }

        public Espaco getEspaco() {
            return espaco;
        }

        public void setEspaco(Espaco espaco) {
            this.espaco = espaco;
        }
        
        @Override
        public int hashCode(){
                return Objects.hash(id);
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
            EspacoItem other = (EspacoItem) obj;
            return Objects.equals(id, other.id);
        }

}
