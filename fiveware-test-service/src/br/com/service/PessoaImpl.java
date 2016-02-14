package br.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.dao.PessoaDAO;
import br.com.entity.Pessoa;

@Service
@Component(value="pessoaImpl")
public class PessoaImpl implements PessoaService {
	
	@Autowired
	@Qualifier("pessoaDAO")
	private PessoaDAO dao;
	
	@Override
	public void save(Pessoa p) {
		dao.insert(p);
	}

	@Override
	public List<Pessoa> buscaTodos() {
		return dao.buscaTodos();
	}

	@Override
	public Pessoa buscaPessoa(Integer id) {
		return dao.buscaPessoa(id);
	}
	
	

}
