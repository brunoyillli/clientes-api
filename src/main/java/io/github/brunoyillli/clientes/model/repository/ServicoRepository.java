package io.github.brunoyillli.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.brunoyillli.clientes.model.entity.Servico;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer>{

}
