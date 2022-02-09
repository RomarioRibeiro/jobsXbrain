package com.jobs.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.jobs.Repository.VendaRepository;
import com.jobs.domain.Venda;

@Service
public class VendaService {

	@Autowired
	private VendaRepository repo;
	
	
	
	
	public Venda find (Integer id) {
		Venda obj = repo.find(id);
		
		return repo.find(id);
	}
	
	public Venda insert(Venda obj) {
		Venda venda = new Venda();
		return repo.save(venda);
	}
	
	public Venda update(Venda obj) {
		Venda venda = new Venda();
		venda.getId();
		return repo.save(venda) ;
	}


	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("nao e possivel excluir um Venda que possui Venda ");
		}
	}
}
