package com.jobs.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.jobs.Repository.ProdutoRepository;
import com.jobs.domain.Produto;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;
	
	public Produto find (Integer id) {
		Produto obj = repo.find(id);
		
		return repo.find(id);
	}


	public Produto insert(Produto obj) {
		Produto produto = new Produto();
		return repo.save(produto);
	}
	
	public Produto update(Produto obj) {
		Produto produto = new Produto();
		produto.getId();
		return repo.save(produto) ;
	}


	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("nao e possivel excluir um produto que possui Venda ");
		}
	}
}
