package io.github.brunoyillli.clientes.service.exception;

public class UsuarioCadastradoException extends RuntimeException {

	private static final long serialVersionUID = 2165955723760180291L;

	public UsuarioCadastradoException(String login) {
		super("Usuario já Cadastrado para o login " + login);
	}
}
