package br.com.ifms.projeto.gerenciamento.evento.crud.Associado;

import org.springframework.stereotype.Component;

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
