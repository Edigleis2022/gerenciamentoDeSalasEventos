package br.com.ifms.projeto.gerenciamento.evento.crud.controlle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("")
    public String mensagem(){
        return "Hello World, pronto para codar!!!";
    }

}
