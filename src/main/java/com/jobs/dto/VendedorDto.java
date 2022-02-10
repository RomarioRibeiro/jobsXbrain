package com.jobs.dto;

import java.io.Serializable;
import java.util.Date;

import com.jobs.domain.Vendedor;

public class VendedorDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id ;
	private String nome;
	private Date dataNasc;
	private String email;
			
	public VendedorDto() {
		super();
	}


	public VendedorDto(Integer id, String nome, Date dataNasc, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.email = email;
	}


	public VendedorDto(Vendedor obj) {
		this.id = obj.getId();
		this.nome =  obj.getNome();
		this.dataNasc = obj.getDataNasc();
		this.email = obj.getEmail();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
