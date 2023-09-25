package br.com.ifms.projeto.gerenciamento.evento.crud.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifms.projeto.gerenciamento.evento.crud.Associado.Associado;

@Repository
public interface AssociadosRepositories extends JpaRepository<Associado, Long> {
    
}
