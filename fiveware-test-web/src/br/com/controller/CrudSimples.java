package br.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.PessoaService;

import br.com.entity.Pessoa;

@Controller
public class CrudSimples {

	@Autowired
	private PessoaService service;

	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public @ResponseBody String hello(@RequestParam(value = "nmPessoa") String nmPessoa,
			@RequestParam(value = "cdSexo") String cdSexo, @RequestParam(value = "nmEmail") String nmEmail,
			@RequestParam(value = "cdCidade") String cdCidade, @RequestParam(value = "inTrabalha") Boolean inTrabalha) {
		
		System.out.println(nmPessoa);
		System.out.println(cdSexo);
		System.out.println(nmEmail);
		System.out.println(cdCidade);
		System.out.println(inTrabalha);
				
		Pessoa p = new Pessoa();
		
		p.setNmPessoa(nmPessoa);
		p.setCdSexo(cdSexo);
		p.setNmEmail(nmEmail);
		p.setInTrabalha(inTrabalha);
		
		service.save(p);


		return "Save Sucess";

	}

}