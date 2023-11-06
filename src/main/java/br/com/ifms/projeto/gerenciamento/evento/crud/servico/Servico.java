package br.com.ifms.projeto.gerenciamento.evento.crud.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.ifms.projeto.gerenciamento.evento.crud.Associado.Associado;
import br.com.ifms.projeto.gerenciamento.evento.crud.Associado.Mensagem;

/*Aqui é o local onde ficaram 
  as regras de negócios do projeto*/
@Service
public class Servico {
    
  @Autowired
  private Mensagem mensagem;

  @Autowired
  private Repositories acao;
  
  public ResponseEntity<?> cadastrar(Associado obj){

      if(obj.getNome().equals("")){
        mensagem.setMensagem("O nome precisa ser preeenchido");
          return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
      }

  }

}
