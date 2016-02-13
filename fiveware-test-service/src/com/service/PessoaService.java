package com.service;

import java.util.List;

import br.com.entity.Pessoa;

public interface PessoaService {

	public void save(Pessoa p);
	
	public List<Pessoa> buscaTodos();
	
	public Pessoa buscaPessoa(Integer id);

}
