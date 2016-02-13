package br.com.dao;

import br.com.entity.Pessoa;
import br.com.padrao.PadraoDAO;

public class PessoaDAO extends PadraoDAO {

	public PessoaDAO() {

	}

	public Pessoa buscaPessoa(Object id) {
		return (Pessoa) findByPK(Pessoa.class, id);
	}

}
