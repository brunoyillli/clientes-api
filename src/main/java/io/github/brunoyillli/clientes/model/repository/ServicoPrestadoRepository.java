package io.github.brunoyillli.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.brunoyillli.clientes.model.entity.ServicoPrestado;

@Repository
public interface ServicoPrestadoRepository extends JpaRepository<ServicoPrestado, Integer>{

}
