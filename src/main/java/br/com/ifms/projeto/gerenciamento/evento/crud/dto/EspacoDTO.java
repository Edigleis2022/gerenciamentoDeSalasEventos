package br.com.ifms.projeto.gerenciamento.evento.crud.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



import br.com.ifms.projeto.gerenciamento.evento.crud.entities.Espaco;
import br.com.ifms.projeto.gerenciamento.evento.crud.entities.EspacoItem;

public class EspacoDTO implements Serializable {
        private static final long serialVersionUID = 1L;


        private Long id;
        private String salao;
        private String quiosque;
        private String quadraEsportiva;

        private List<EspacoItem> espacosItem = new ArrayList<>();

        public EspacoDTO(){
            //TODO Auto-generated constructor stub
        }

        public EspacoDTO(Long id, String salao, String quiosque, String quadraEsportiva){

                this.id = id;
                this.salao = salao;
                this.quiosque = quiosque;
                this.quadraEsportiva = quadraEsportiva;
        }

        public EspacoDTO(Espaco entity){
                this.id = entity.getId();
                this.salao = entity.getSalao();
                this.quiosque = entity.getQuiosque();
                this.quadraEsportiva = entity.getQuadraEsportiva();
        }

        public EspacoDTO(Espaco entity, List<EspacoItem> espacosItem){
                this(entity);
                this.espacosItem = espacosItem.stream().map(x -> new EspacoItem(
                                x.getId(), x.getNumeroSerie(), x.getSituacao()))
                                .collect(Collectors.toList());
        }

        public List<EspacoItem> getEspacosItem(){
            return espacosItem;
        }

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
