package br.com.ifms.projeto.gerenciamento.evento.crud.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifms.projeto.gerenciamento.evento.crud.Associado.Associado;

/**
 * Repositorio é a camada de persistência onde pode efetuar ações
 * de banco de dados como: cadastrar,selecionar, alterar e excluir por exemplo.
 *Aquei se faz funções de SQL
 */

@Repository
public interface AssociadosRepositories extends JpaRepository<Associado, Long> {
    
    /*
     * List/lista trás uma lista requisitada
     * findAll é um comando nativo que quando chamado retorna
     * uma lista chamada Associado.
     */

    List<Associado> findAll();

    /*
     * Método para exibi o nome e o lote e Id
     * Usa com o List quando vai retornar muitos registro
     * findByid Pega pela caracteristica
     */

    Associado findByid(long id);

    
    list<Associado> findByOrderBy;

}
