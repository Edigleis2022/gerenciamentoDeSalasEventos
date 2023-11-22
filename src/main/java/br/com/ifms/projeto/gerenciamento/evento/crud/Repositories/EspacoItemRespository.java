package br.com.ifms.projeto.gerenciamento.evento.crud.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.ifms.projeto.gerenciamento.evento.crud.entities.EspacoItem;
import br.com.ifms.projeto.gerenciamento.evento.crud.entities.enums.Situacao;


/**
 * 
 * 
*/
public interface EspacoItemRespository extends JpaRepository<EspacoItem, Long> {

        //QueryMethods
        EspacoItem findByNumeroSerie(String numeroSerie);
        List<EspacoItem> findBySituacao(Situacao situacao);

        //Query - Consultas customizzads =========================
    
        //SELECT numero_serie FROM tb_espaco_item WHERE situacao = 'DISPONIVEL'
        
    
}
