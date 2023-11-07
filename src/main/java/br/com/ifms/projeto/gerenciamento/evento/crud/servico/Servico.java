package br.com.ifms.projeto.gerenciamento.evento.crud.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.ifms.projeto.gerenciamento.evento.crud.Associado.Associado;
import br.com.ifms.projeto.gerenciamento.evento.crud.Associado.Mensagem;
import br.com.ifms.projeto.gerenciamento.evento.crud.Repositories.AssociadosRepositories;

/*Aqui é o local onde ficaram 
  as regras de negócios do projeto*/
@Service
public class Servico {
    
  @Autowired
  private Mensagem mensagem;

  @Autowired
  private AssociadosRepositories acao;
  
  /* Método para cadastrar Associados */
  public ResponseEntity<?> cadastrar(Associado obj){
      /*Método para imprimir uma mensagem caso o obj estiver vazio */
      if(obj.getNome().equals("")){
          mensagem.setMensagem("O nome precisa ser preeenchido");
          return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
      }else if(obj.getIdade() < 44){
          mensagem.setMensagem("Informe uma idade válida");
          return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
      }else {
        return new ResponseEntity<>(acao.save(obj), HttpStatus.CREATED);
      }

  }

  /*Método para selecionar ASSOCIADOS  */
  public ResponseEntity<?> selecionar(){
    return new ResponseEntity<>(acao.findAll(), HttpStatus.OK);
  }

  //Método para selecionar associado pelo ID
  public ResponseEntity<?> selecionarPeloId(Long id){
    
      if (acao.countById(id) == 0) {
        mensagem.setMensagem("Não foi encontrado nenhum associado");
        return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
      }else{
        return new ResponseEntity<>(acao.findById(id), HttpStatus.OK);
      }
  }

  //Método para editar dados
  public ResponseEntity<?> editar(Associado obj){

      if (acao.countById(obj.getId()) == 0) {
        mensagem.setMensagem("O id informado não existe.");
        return new ResponseEntity<>(mensagem, HttpStatus.NOT_FOUND);
      }else if (obj.getNome().equals("")) {
        mensagem.setMensagem("É necessário informar um nome");
        return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
      }else if (obj.getIdade() < 18) {
        mensagem.setMensagem("Informe uma idade válida");
        return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);       
      }else 
        return new ResponseEntity<>(acao.save(obj), HttpStatus.OK);
  }

  //Métodopara remover registros
  public ResponseEntity<?> remover(Long id){

      if (acao.countById(id) == 0) {
        mensagem.setMensagem("O código informado não existe");
        return new ResponseEntity<>(mensagem, HttpStatus.NOT_FOUND);
      }else{

          Associado obj = acao.findByid(0);
          acao.delete(obj);

          mensagem.setMensagem("Associado removido com sucesso!!");
          return new ResponseEntity<>(mensagem, HttpStatus.OK);

      }
  }

}
