package br.com.ifms.projeto.gerenciamento.evento.crud.Associado;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AssociadoController {
    
    @GetMapping("")
    public String mensagem(){
        return "Hello World, pronto para codar!!!";
    }

    //Exemplo de curso
    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem Vindo Associado(a) " + nome + " !!! ";
    }

    @PostMapping("/associado")
    public Associado associado(@RequestBody Associado socio){
        return socio;
    }

}
