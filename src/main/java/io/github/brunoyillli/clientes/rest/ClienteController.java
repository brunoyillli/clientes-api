package io.github.brunoyillli.clientes.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.github.brunoyillli.clientes.model.entity.Cliente;
import io.github.brunoyillli.clientes.model.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository repository;


	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente salvar(	@RequestBody Cliente cliente) {
		return repository.save(cliente);
	}
}
