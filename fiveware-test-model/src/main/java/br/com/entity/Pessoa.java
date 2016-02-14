package br.com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cd_pessoa")
	private Integer cdPessoa;

	@Column(name = "nm_pessoa")
	private String nmPessoa;

	@Column(name = "cd_estado_civil")
	private String cdEstadoCivil;

	@Column(name = "cd_sexo")
	private String cdSexo;

	@Column(name = "nm_email")
	private String nmEmail;

	@Column(name = "in_trabalha")
	private Boolean inTrabalha;

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

	public String getCdEstadoCivil() {
		return cdEstadoCivil;
	}

	public void setCdEstadoCivil(String cdEstadoCivil) {
		this.cdEstadoCivil = cdEstadoCivil;
	}

	public String getCdSexo() {
		return cdSexo;
	}

	public void setCdSexo(String cdSexo) {
		this.cdSexo = cdSexo;
	}

	public String getNmEmail() {
		return nmEmail;
	}

	public void setNmEmail(String nmEmail) {
		this.nmEmail = nmEmail;
	}

	public Boolean getInTrabalha() {
		return inTrabalha;
	}

	public void setInTrabalha(Boolean inTrabalha) {
		this.inTrabalha = inTrabalha;
	}

}
