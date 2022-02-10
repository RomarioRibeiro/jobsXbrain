package com.jobs.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.jobs.Repository.VendedoresRepository;
import com.jobs.domain.Vendedor;
import com.jobs.dto.VendedorDto;

@Service
public class VendedoresService {

	@Autowired
	private VendedoresRepository repo;
	
	public Vendedor find (Integer id) {
		Vendedor obj = repo.find(id);
		
		return repo.find(id);
	}
	
	public List<VendedorDto> findAll() {
		List<Vendedor> apar = repo.findAll();
		List<VendedorDto> aparDto = new ArrayList<>();
		for (Vendedor a : apar) {
			VendedorDto Dto = new VendedorDto(a);
			aparDto.add(Dto);
		}

		return aparDto;
	}
	
	public Vendedor insert(Vendedor obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
	public Vendedor update(Vendedor obj) {
		find(obj.getId());
		return repo.save(obj) ;
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
