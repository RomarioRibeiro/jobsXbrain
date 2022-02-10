package com.jobs.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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
	private List<Produto> produtoId;
	private String produnoNome ;
	private BigDecimal preco;
	
	
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
		this.produtoId = produtoId;
		this.produnoNome = produnoNome;
		this.preco = preco;
	}



	public VendaDto(Venda obj) {
		this.id = obj.getId();
		this.dataDaVenda = obj.getDataDaVenda();
		this.valorTotal = obj.getValorTotal();
		this.vendedorId = obj.getVendedor().getId();
		this.nome= obj.getVendedor().getNome();
		this.dataNasc = obj.getVendedor().getDataNasc();
		this.email = obj.getVendedor().getEmail();
		this.produtoId= obj.getProdutos();
	
		
		
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



	public List<Produto> getProdutoId() {
		return produtoId;
	}



	public void setProdutoId(List<Produto> produtoId) {
		this.produtoId = produtoId;
	}



	public String getProdunoNome() {
		return produnoNome;
	}



	public void setProdunoNome(String produnoNome) {
		this.produnoNome = produnoNome;
	}



	public BigDecimal getPreco() {
		return preco;
	}



	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	
	
	
	
}
