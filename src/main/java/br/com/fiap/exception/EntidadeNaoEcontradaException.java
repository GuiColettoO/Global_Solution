package br.com.fiap.exception;

public class EntidadeNaoEcontradaException extends Exception {
	
	private static final long serialVersionUID = 4397699173541112141L;

	public EntidadeNaoEcontradaException() {
		super("Entidade não encontrada");
	}
	
	public EntidadeNaoEcontradaException(String msg) {
		super(msg);
	}

}