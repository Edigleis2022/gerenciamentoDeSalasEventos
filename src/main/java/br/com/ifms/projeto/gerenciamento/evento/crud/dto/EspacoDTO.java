package br.com.ifms.projeto.gerenciamento.evento.crud.dto;

import java.io.Serializable;

public class EspacoDTO implements Serializable {
        private static final long serialVersionUID = 1L;


        private Long id;
        private String salao;
        private String quiosque;
        private String quadraEsportiva;


        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getSalao() {
            return salao;
        }
        public void setSalao(String salao) {
            this.salao = salao;
        }
        public String getQuiosque() {
            return quiosque;
        }
        public void setQuiosque(String quiosque) {
            this.quiosque = quiosque;
        }
        public String getQuadraEsportiva() {
            return quadraEsportiva;
        }
        public void setQuadraEsportiva(String quadraEsportiva) {
            this.quadraEsportiva = quadraEsportiva;
        }

}
