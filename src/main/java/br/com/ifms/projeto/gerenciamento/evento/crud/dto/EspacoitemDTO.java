package br.com.ifms.projeto.gerenciamento.evento.crud.dto;

import java.io.Serializable;

import br.com.ifms.projeto.gerenciamento.evento.crud.entities.Espaco;
import br.com.ifms.projeto.gerenciamento.evento.crud.entities.EspacoItem;
import br.com.ifms.projeto.gerenciamento.evento.crud.entities.enums.Situacao;

public class EspacoItemDTO implements Serializable {
        private static final long serialVersionUID = 1l;

        private Long id;
        private String numeroSerie;
        private Situacao situacao;
        private Espaco espaco;

         public EspacoItemDTO(){
            //TODO Auto-generated constructor stub
        }
        
        public EspacoItemDTO(Long id, String numeroSerie, Situacao situacao, Espaco espaco){
            this.id = id;
            this.numeroSerie = numeroSerie;
            this.situacao = situacao;
            this.espaco = espaco;
        }
        
        public EspacoItemDTO(EspacoItem entity){
            this.id = entity.getId();
            this.numeroSerie = entity.getNumeroSerie();
            this.situacao = entity.getSituacao();
            this.espaco = entity.getEspaco();
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

       
}
