package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.entity.Pessoa;

@Service
public class PessoaImpl implements PessoaService {
	
//	@Autowired
//	private PessoaDAO dao;
	
	@Override
	public void save(Pessoa p) {
		//dao.insert(p);
	}

	@Override
	public List<Pessoa> buscaTodos() {
		return null;
	}

	@Override
	public Pessoa buscaPessoa(Integer id) {
		return null;//dao.buscaPessoa(id);
	}
	
	

}
