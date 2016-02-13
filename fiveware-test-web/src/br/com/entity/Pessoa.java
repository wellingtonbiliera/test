package br.com.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Pessoa {
	
	@Id 
	@GeneratedValue
	@Getter	@Setter
	private int id;

	@Getter	@Setter
	private String nome;

	@Getter	@Setter
	private String sexo;

	@Getter	@Setter
	private boolean ativo;
	
	@Getter	@Setter
	@ManyToOne(fetch = FetchType.EAGER)
	private Cidade cidade;

	public Pessoa() {
	}

}
