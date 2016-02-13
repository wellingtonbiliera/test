package br.com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cd_pessoa")
	private Integer cdPessoa;

	@Column(name = "nm_pessoa")
	private String nmPessoa;

	@Column(name = "cd_estado_civil")
	private Integer cdEstadoCivil;

	public Pessoa() {
	}

	public Integer getCdPessoa() {
		return cdPessoa;
	}

	public void setCdPessoa(Integer cdPessoa) {
		this.cdPessoa = cdPessoa;
	}

	public String getNmPessoa() {
		return nmPessoa;
	}

	public void setNmPessoa(String nmPessoa) {
		this.nmPessoa = nmPessoa;
	}

	public Integer getCdEstadoCivil() {
		return cdEstadoCivil;
	}

	public void setCdEstadoCivil(Integer cdEstadoCivil) {
		this.cdEstadoCivil = cdEstadoCivil;
	}

}
