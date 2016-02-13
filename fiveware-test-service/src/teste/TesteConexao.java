package teste;

import br.com.dao.PessoaDAO;
import br.com.entity.Pessoa;

public class TesteConexao {
	
	public static void main(String ... args) {
		System.out.println("teste");
		
		PessoaDAO dao = new PessoaDAO();
		Pessoa p = dao.buscaPessoa(1);
		
		System.out.println(p.getNmPessoa());
	}

}
