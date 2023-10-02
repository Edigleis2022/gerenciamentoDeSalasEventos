package br.com.ifms.projeto.gerenciamento.evento.crud.Associado;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
     * 
     * 
     */
    @Autowired
    private AssociadosRepositories acao;

    /*
     * O SAVE tem dua funções cadastrar ou editar
     */
    @PostMapping("/api")
    public Associado cadastrar(@RequestBody Associado obj){
        return acao.save(obj);
    }

    /*Este method lista os dados do Banco de Dados*/
    @GetMapping("/api")
    public List<Associado> selecionar(){
        return acao.findAll();
    }

    /*Este metodo filtra os dados do Banco de dados */
    @GetMapping("/api/{id}")
    public Associado selecionarPeloId(@PathVariable Long id){
        return acao.findByid(id);
    }

    /* Este metodo retorna um objeto editado.
     * 
    */
    @PutMapping("/api")
    public Associado editar(@RequestBody Associado obj){
        return acao.save(obj);
    }

    @DeleteMapping("/api/{id}")
    public void remover(@PathVariable Long id){
        Associado obj = selecionarPeloId(id);

        acao.delete(obj);
    }

    /**Funçao COUNT retorna a quantidade de registro em uma tabela */
    @GetMapping("/api/contador")
    public Long contador(){
        return acao.count();
    }

    @GetMapping("")
    public String mensagem(){
        return "Hello World, pronto para codar!!!";
    }
    
    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem Vindo Associado(a) " + nome + " !!! ";
    }

    @PostMapping("/associado")
    public Associado associado(@RequestBody Associado socio){
        return socio;
    }

}
