package br.com.ifms.projeto.gerenciamento.evento.crud.Associado;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifms.projeto.gerenciamento.evento.crud.Repositories.AssociadosRepositories;

@RestController
public class AssociadoController {
    
    //Exemplo de curso

    @Autowired
    private AssociadosRepositories acao;

    @PostMapping("/api")
    public Associado cadastrar(@RequestBody Associado obj){
        return acao.save(obj);
    }

    @GetMapping("/api")
    public List<Associado> selecionar(){
        return acao.findAll();
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
