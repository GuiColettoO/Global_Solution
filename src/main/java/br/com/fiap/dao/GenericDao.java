package br.com.fiap.dao;

import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.EntidadeNaoEcontradaException;

//GenericDao<Cliente, String> dao =
//GenericDao<Produto, Integer> dao2 = 

public interface GenericDao<E,K> {

	void salvar(E entidade);
	void deletar(K id) throws EntidadeNaoEcontradaException;
	E buscar(K id) throws EntidadeNaoEcontradaException;
	void commit() throws CommitException;
	
}