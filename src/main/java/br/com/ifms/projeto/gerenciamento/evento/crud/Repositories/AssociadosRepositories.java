package br.com.ifms.projeto.gerenciamento.evento.crud.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifms.projeto.gerenciamento.evento.crud.Associado.Associado;

/**
 * Criamos o repositorio que é a camada de persistência onde podemos efetuar ações
 * de banco de dados como: cadastrar,selecionar, alterar e excluir por exemplo.
 *
 */

@Repository
public interface AssociadosRepositories extends JpaRepository<Associado, Long> {
    
    /*
     * List tras uma lista requisitada
     * findAll é um comando nativo que quando chamdo retorna
     *  uma lista chamada Associado.
     */

    List<Associado> findAll();

    /*
     * Método para exibi o nome e o lote e Id
     * 
     */

    

}
