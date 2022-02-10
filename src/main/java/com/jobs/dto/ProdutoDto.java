package com.jobs.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.jobs.domain.Produto;

public class ProdutoDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private int id ;
	private String nome ;
	private BigDecimal preco;
	
	
	public ProdutoDto() {
		super();
	}

	
	

	public ProdutoDto(int id, String nome, BigDecimal preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}




	public ProdutoDto(Produto obj) {
	this.id = obj.getId();
	this.nome = obj.getNome();
	this.preco = obj.getPreco();
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public BigDecimal getPreco() {
		return preco;
	}


	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	
	
	
}
