package io.github.brunoyillli.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.brunoyillli.clientes.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
