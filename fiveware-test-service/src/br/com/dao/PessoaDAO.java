package br.com.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.entity.Pessoa;
import br.com.padrao.PadraoDAO;

@Service
@Component(value = "pessoaDAO")
public class PessoaDAO extends PadraoDAO {

	public PessoaDAO() {

	}

	public Pessoa buscaPessoa(Object id) {
		return (Pessoa) findByPK(Pessoa.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Pessoa> buscaTodos() {
		Query query = manager.createNamedQuery("buscaTodos");
		return query.getResultList();
	}

}
