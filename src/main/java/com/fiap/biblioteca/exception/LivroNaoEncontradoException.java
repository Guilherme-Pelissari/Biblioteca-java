package com.fiap.biblioteca.exception;

public class LivroNaoEncontradoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

    public LivroNaoEncontradoException(String message) {
        super(message);
    }
}