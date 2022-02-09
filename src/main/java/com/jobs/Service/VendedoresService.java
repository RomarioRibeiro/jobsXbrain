package com.jobs.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.jobs.Repository.VendedoresRepository;
import com.jobs.domain.Vendedor;

@Service
public class VendedoresService {

	@Autowired
	private VendedoresRepository repo;
	
	public Vendedor find (Integer id) {
		Vendedor obj = repo.find(id);
		
		return repo.find(id);
	}
	
	public Vendedor insert(Vendedor obj) {
		Vendedor vendedor = new Vendedor();
		return repo.save(vendedor);
	}
	
	public Vendedor update(Vendedor obj) {
		Vendedor vendedor = new Vendedor();
		vendedor.getId();
		return repo.save(vendedor) ;
	}


	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("nao e possivel excluir um Vendedor que possui Venda ");
		}
	}
}
