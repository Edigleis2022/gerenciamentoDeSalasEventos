package br.com.ifms.projeto.gerenciamento.evento.crud.Associado;

import org.springframework.stereotype.Component;

/*A annotecion Component vai varrer, 
  pesquisar e procurar todos os elementos 
  que estiverem dentro dessa classe mensagem */
@Component
public class Mensagem {
    
    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
}
