package br.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.entity.Pessoa;
import br.com.service.PessoaService;

@Controller
public class CrudSimples {

	@Autowired
	@Qualifier("pessoaImpl")
	private PessoaService service;

	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public @ResponseBody String save(@RequestParam(value = "nmPessoa") String nmPessoa,
			@RequestParam(value = "cdEstadoCivil") String cdEstadoCivil, @RequestParam(value = "cdSexo") String cdSexo,
			@RequestParam(value = "nmEmail") String nmEmail, @RequestParam(value = "cdCidade") String cdCidade,
			@RequestParam(value = "inTrabalha") Boolean inTrabalha) {

		Pessoa p = new Pessoa();

		p.setNmPessoa(nmPessoa);
		p.setCdEstadoCivil(cdEstadoCivil);
		p.setCdSexo(cdSexo);
		p.setNmEmail(nmEmail);
		p.setInTrabalha(inTrabalha);

		service.save(p);

		return "Save Sucess";

	}

	@RequestMapping(value = "listaItens", method = RequestMethod.GET)
	public List<Pessoa> lista() {
		List<Pessoa> itens = service.buscaTodos();
		return itens;
	}

}