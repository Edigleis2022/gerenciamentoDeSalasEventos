package br.com.ifms.projeto.gerenciamento.evento.crud.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ifms.projeto.gerenciamento.evento.crud.Repositories.AssociadosRepository;
import br.com.ifms.projeto.gerenciamento.evento.crud.dto.AssociadoDTO;
import br.com.ifms.projeto.gerenciamento.evento.crud.entities.Associado;


@Service
public class AssociadoService {

        @Autowired
        private AssociadosRepository repository;

        @Autowired
        private BCryptPasswordEncoder passwordEncoder;

        @Transactional(readOnly =  true)    
        private List<AssociadoDTO> findAll(){
                 List<Associado> lista = repository.findAll();
                 return lista.stream().map(x -> new AssociadoDTO(x)).collect(collectors.toList());
        }

        @Transactional(readOnly = true)
        public AssociadoDTO findById(Long id){
                Optional<Associado> obj = repository.findById(id);

                Associado entity = obj.orElseThrow(() -> new ResourceNotFoundException("O registro solicitado não foi localizado"));
                return new AssociadoDTO(entity);
        }

}
