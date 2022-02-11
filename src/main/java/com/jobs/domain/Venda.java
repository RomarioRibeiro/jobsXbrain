package com.jobs.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Venda implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id ;
	private Date dataDaVenda;
	@ManyToOne
	private Vendedor vendedor;
	private BigDecimal valorTotal;
	
    @OneToMany(mappedBy = "id.venda", cascade = CascadeType.REMOVE)
	private Set<ItemVenda> itensVenda = new HashSet<>();

    
    public Venda() {
		super();
	}

    
    
	public Set<ItemVenda> getItensVenda() {
		return itensVenda;
	}



	public void setItensVenda(Set<ItemVenda> itensVenda) {
		this.itensVenda = itensVenda;
	}



	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}



	public Venda(Integer id, String nome, Date dataDaVenda, Produto produto) {
		super();
		this.id = id;
		this.dataDaVenda = dataDaVenda;

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

	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Venda [id=" + id + ", dataDaVenda=" + dataDaVenda + "]";
	}
	
	
}
