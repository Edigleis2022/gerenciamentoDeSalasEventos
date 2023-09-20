package br.com.ifms.projeto.gerenciamento.evento.crud.Associado;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AssociadoController {
    
    @GetMapping("")
    public String mensagem(){
        return "Hello World, pronto para codar, pronto para aprender!!!";
    }

}
