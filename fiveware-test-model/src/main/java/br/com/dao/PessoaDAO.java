package br.com.dao;

import br.com.entity.Pessoa;
import br.com.padrao.PadraoDAO;

public class PessoaDAO extends PadraoDAO {

	public PessoaDAO() {

	}

	public Pessoa buscaPessoa() {
		Pessoa p = new Pessoa();
		p.setCdPessoa(1);
		return (Pessoa) findByPK(p.getClass(), p.getCdPessoa());
	}

}
