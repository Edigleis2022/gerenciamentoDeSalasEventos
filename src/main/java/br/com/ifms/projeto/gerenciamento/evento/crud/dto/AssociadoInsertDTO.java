package br.com.ifms.projeto.gerenciamento.evento.crud.dto;


@AssociadoInsertValid
public class AssociadoInsertDTO extends AssociadoDTO {
        private static final long serialVersionUID = 1l;

        private String senha;
        
        public AssociadoInsertDTO(){
            super();
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }
}
