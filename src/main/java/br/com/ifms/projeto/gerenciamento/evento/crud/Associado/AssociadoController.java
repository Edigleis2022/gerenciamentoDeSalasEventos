package br.com.ifms.projeto.gerenciamento.evento.crud.Associado;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import br.com.ifms.projeto.gerenciamento.evento.crud.Repositories.AssociadosRepositories;


@RestController
public class AssociadoController {
    
    //Exemplo de curso
    /*
     * O objeto criado ACAO chama os metodos
     * Annotecion autowired é um atalho para ter acesso a determinados 
     * métodos
     * 
     */
    @Autowired
    private AssociadosRepositories acao;

    /*
     * O SAVE tem dua funções cadastrar ou editar
     * Efetuar um INSERT
     */
    @PostMapping("/api")//cadastra no banco de dados
    public Associado cadastrar(@RequestBody Associado obj){
        return acao.save(obj);
    }

    /*Este method lista os dados do Banco de Dados*/
    @GetMapping("/api")
    public List<Associado> selecionar(){
        return acao.findAll();
    }

    /* Este metodo filtra os dados do Banco de dados 
     * da tabela associado.
     * finByidEle pega pela caracteristica da classe
     */
    @GetMapping("/api/{id}")
    public Associado selecionarPeloId(@PathVariable Long id){
        return acao.findByid(id);
    }

    /* Este metodo retorna um objeto editado.
     * Altera os resgistro. Equivale ao comando update do SQL
    */
    @PutMapping("/api")
    public Associado editar(@RequestBody Associado obj){
        return acao.save(obj);
    }

    /*
     * Método DELETE    
     */

    @DeleteMapping("/api/{id}")
    public void remover(@PathVariable Long id){
        Associado obj = selecionarPeloId(id);

        acao.delete(obj);
    }

    /*
    *Long é o tipo de informação que o metodo COUT vai retornar
    *Funçao COUNT retorna a 
    quantidade de registro em uma tabela */
    @GetMapping("/api/contador")
    public Long contador(){
        return acao.count();
    }

    /** Metodo cresente */
    @GetMapping("/api/ordenarNomes")
    public List<Associado> ordenarNomes(){
        return acao.findByOrderByNome();
    }

    /** Metodo decresente */
    @GetMapping("/api/ordenarNomesDe")
    public List<Associado> ordenarNomesDesc(){
        return acao.findByOrderByNomeDesc();
    }

    /*Metodo que lista pelo nome e ordena pelo cpf */
    @GetMapping("/api/ordenarNomes2")
    public List<Associado> ordenarNomes2(){
        return acao.findByNomeOrderByCpfAsc("Edilgies Pereira");
    }

    /*Metodo para listar o nome pela letra */
    @GetMapping("/api/nomeContem")
    public List<Associado> nomeContem(){
        return acao.findByNomeContaining("é");
    }

    /*Metodo para lista os nome com que inicia com a letra a e finaliza 
     * com a letra a.
     */
    @GetMapping("/api/iniciaCom")
    public List<Associado> iniciarCom(){
        return acao.findByNomeStartsWith("A");
    }
    @GetMapping("/api/terminaCom")
    public List<Associado> terminarCom(){
        return acao.findByNomeEndsWith("E");
    }

    /**
     * Método soma idade
     * 
     */
    
    @GetMapping("/api/somaIdades")
    public int somaIdades(){
        return acao.somaIdades();
    }   
    
    /*Métado para trazer um registro de 
      associado com idade maior ou igual a 39 */
    @GetMapping("/api/idadeMaiorIgual")
    public List<Associado> idadeMaiorIgual(){
        return acao.idadeMaiorIgual(39);
    }

    @GetMapping("/status")
    public ResponseEntity<?> status(){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /*
     * Inicio dos Métodos
     * 
     */
    @GetMapping("")
    public String mensagem(){
        return "Hello World, pronto para codar!!!";
    }
    
    /* Pegar uma informação passada 
     * na Url e trata como uma variavel.
     * 
     */
    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem Vindo Associado(a) " + nome + " !!! ";
    }

    /*
     * Model/modelo
     * 
     */
    @PostMapping("/associado")
    public Associado associado(@RequestBody Associado socio){
        return socio;
    }

}
