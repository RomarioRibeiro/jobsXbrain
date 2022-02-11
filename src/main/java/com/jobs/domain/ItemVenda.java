package com.jobs.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ItemVenda implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private ItemnVendaPK id  = new ItemnVendaPK();
	
	
//	@JsonIgnore
//	@EmbeddedId
//	private ItemPedidoPK id = new ItemPedidoPK();
	
	private BigDecimal desconto ;
	private Integer quantidade;
	private BigDecimal  preco;
	
	
	public ItemVenda() {
		super();
	}





	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}





	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}





	public ItemnVendaPK getId() {
		return id;
	}


	public void setId(ItemnVendaPK id) {
		this.id = id;
	}




	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}





	public BigDecimal getDesconto() {
		return desconto;
	}





	public BigDecimal getPreco() {
		return preco;
	}



	
	
}
