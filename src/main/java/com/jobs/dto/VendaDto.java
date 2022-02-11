package com.jobs.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.jobs.domain.ItemVenda;
import com.jobs.domain.Produto;
import com.jobs.domain.Venda;

public class VendaDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id ;
	private Date dataDaVenda;
	private BigDecimal valorTotal;
	private int vendedorId;
	private String nome;
	private Date dataNasc;
	private String email;
	private Set<ItemVenda> itensVenda = new HashSet<>();
	
	



	public Set<ItemVenda> getItensVenda() {
		return itensVenda;
	}



	public void setItensVenda(Set<ItemVenda> itensVenda) {
		this.itensVenda = itensVenda;
	}



	public VendaDto() {
		super();
	}

	

	public VendaDto(Integer id, Date dataDaVenda, BigDecimal valorTotal, int vendedorId, String nome, Date dataNasc,
			String email, List<Produto> produtoId, String produnoNome, BigDecimal preco) {
		super();
		this.id = id;
		this.dataDaVenda = dataDaVenda;
		this.valorTotal = valorTotal;
		this.vendedorId = vendedorId;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.email = email;
		
	}



	public VendaDto(Venda obj) {
		this.id = obj.getId();
		this.dataDaVenda = obj.getDataDaVenda();
		this.valorTotal = obj.getValorTotal();
		this.vendedorId = obj.getVendedor().getId();
		this.nome= obj.getVendedor().getNome();
		this.dataNasc = obj.getVendedor().getDataNasc();
		this.email = obj.getVendedor().getEmail();
		this.itensVenda = obj.getItensVenda();
		
		
	
		
		
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Date getDataDaVenda() {
		return dataDaVenda;
	}



	public void setDataDaVenda(Date dataDaVenda) {
		this.dataDaVenda = dataDaVenda;
	}



	public BigDecimal getValorTotal() {
		return valorTotal;
	}



	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}



	public int getVendedorId() {
		return vendedorId;
	}



	public void setVendedorId(int vendedorId) {
		this.vendedorId = vendedorId;
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
