package com.jobs.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Vendedores implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id ;
	private String nome;
	private String idade;
	private String dataDeNacimento ;
	private String email;
	private String totalDeVendas;
	private String vendaMedia;
	private Venda venda;
	
	public Vendedores() {
		super();
	}

	

	public Vendedores(Integer id, String nome, String idade, String dataDeNacimento, String email, String totalDeVendas,
			String vendaMedia, Venda venda) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.dataDeNacimento = dataDeNacimento;
		this.email = email;
		this.totalDeVendas = totalDeVendas;
		this.vendaMedia = vendaMedia;
		this.venda = venda;
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



	public String getIdade() {
		return idade;
	}



	public void setIdade(String idade) {
		this.idade = idade;
	}



	public String getDataDeNacimento() {
		return dataDeNacimento;
	}



	public void setDataDeNacimento(String dataDeNacimento) {
		this.dataDeNacimento = dataDeNacimento;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTotalDeVendas() {
		return totalDeVendas;
	}



	public void setTotalDeVendas(String totalDeVendas) {
		this.totalDeVendas = totalDeVendas;
	}



	public String getVendaMedia() {
		return vendaMedia;
	}



	public void setVendaMedia(String vendaMedia) {
		this.vendaMedia = vendaMedia;
	}



	public Venda getVenda() {
		return venda;
	}



	public void setVenda(Venda venda) {
		this.venda = venda;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendedores other = (Vendedores) obj;
		return Objects.equals(id, other.id);
	}



	@Override
	public String toString() {
		return "Vendedores [id=" + id + ", nome=" + nome + ", idade=" + idade + ", dataDeNacimento=" + dataDeNacimento
				+ ", email=" + email + ", totalDeVendas=" + totalDeVendas + ", vendaMedia=" + vendaMedia + ", venda="
				+ venda + "]";
	}

	
	
	
	
	
}
