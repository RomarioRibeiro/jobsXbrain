package com.jobs.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.jobs.Repository.ProdutoRepository;
import com.jobs.domain.Produto;
import com.jobs.dto.ProdutoDto;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;
	
	public Produto find (Integer id) {
		Produto obj = repo.find(id);
		
		return repo.find(id);
	}

	
	public List<ProdutoDto> findAll() {
		List<Produto> apar = repo.findAll();
		List<ProdutoDto> aparDto = new ArrayList<>();
		for (Produto a : apar) {
			ProdutoDto Dto =  new ProdutoDto(a);
			aparDto.add(Dto);
		}

		return aparDto;
	}
	

	public Produto insert(Produto obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
	public Produto update(Produto obj) {
		
		find(obj.getId());
		return repo.save(obj) ;
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
