package br.com.ifms.projeto.gerenciamento.evento.crud.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
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

    /*
     * O dados começa a contar de fomar crecente
     * 
     */
    List<Associado> findByOrderByNome();

    /*
     * O dados começa a contar de fomar Decrecente
     * 
     */
    List<Associado> findByOrderByNomeDesc();

    /* Lista o objeto model pelo nome depois filtrar pelo cpf */

    List<Associado> findByNomeOrderByCpfAsc(String nome);

    /*Esta função é parecida com o Link do banco de dados  */
    List<Associado> findByNomeContaining(String termo);

    /*Todo os nomes que inicia com a primeira lera
      com serão listados */
    List<Associado> findByNomeStartsWith(String termo);

    /*Todos os nomes que finalizam com a última letra,
      serão listados */
    List<Associado> findByNomeEndsWith(String termo);

    @Query(value = "SELECT SUM(idade) FROM associados", nativeQuery = true)
    int somaIdades();

    /* */
    @Query(value = "SELECT * FROM associados WHERE idade >= :idade", nativeQuery = true)
    List<Associado> idadeMaiorIgual(int idade);

    int countById(Long id);

}
