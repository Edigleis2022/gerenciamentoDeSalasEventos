package br.com.ifms.projeto.gerenciamento.evento.crud.dto;

import java.io.Serializable;

public class EspacoItemSituacao implements Serializable {
        private static final long serialVersionUID = 1l;

        private String numeroSerie;

        public EspacoItemSituacaoDTO(){}
        
        public EspacoItemSituacaoDTO(String numeroSerie){
            this.numeroSerie = numeroSerie;
        }

        public String getNumeroSerie() {
                return numeroSerie;
        }

        public void setNumeroSerie(String numeroSerie){
            this.numeroSerie = numeroSerie;
        }
}
