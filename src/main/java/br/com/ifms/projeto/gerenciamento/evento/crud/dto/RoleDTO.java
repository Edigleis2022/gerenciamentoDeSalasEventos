package br.com.ifms.projeto.gerenciamento.evento.crud.dto;

import java.io.Serializable;

import br.com.ifms.projeto.gerenciamento.evento.crud.entities.Role;

public class RoleDTO implements Serializable {
        private static final long serialVersionUID = 1L;

        private Long id;
        private String authority;

        public RoleDTO(){
            // TODO Auto-generated constructor stub
        }

        public RoleDTO(Long id, String authority){
            this.id = id;
            this.authority = authority;
        }

        public RoleDTO(Role entity){
            this.id= entity.getId();
            this.authority = entity.getAuthority();
        }

        public Long getId(){
            return id;
        }

        public void setId(Long id){
            this.id = id;
        }

        public String getAuthority(){
            return authority;
        }

        public void setAuthority(){
            this.authority = authority;
        }
}
