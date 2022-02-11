package com.jobs.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Embeddable
public class ItemnVendaPK implements Serializable {    
	private static final long serialVersionUID = 1L;
	@JsonIgnore
	@ManyToOne
	@JoinColumn (name= "venda_id")
	private Venda venda;
	@ManyToOne
	@JoinColumn (name= "produto_id")
	private Produto produto;
	
		
	
	
	public ItemnVendaPK(Venda venda, Produto produto) {
		super();
		this.venda = venda;
		this.produto = produto;
	}
	public ItemnVendaPK() {
		super();
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
		
}
