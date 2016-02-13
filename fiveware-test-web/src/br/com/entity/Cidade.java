package br.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Cidade {
	
	@Id 
	@GeneratedValue
	@Getter	@Setter
	private int id;

}
