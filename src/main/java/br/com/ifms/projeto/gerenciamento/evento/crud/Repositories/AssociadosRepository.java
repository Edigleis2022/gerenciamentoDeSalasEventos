package br.com.ifms.projeto.gerenciamento.evento.crud.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ifms.projeto.gerenciamento.evento.crud.entities.Associado;

@Repository
public interface AssociadosRepository extends JpaRepository<Associado, Long> {

        Associado findByEmail(String email);
}