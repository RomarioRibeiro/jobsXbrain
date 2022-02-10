package com.jobs.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.jobs.Repository.VendaRepository;
import com.jobs.domain.Venda;
import com.jobs.dto.VendaDto;

@Service
public class VendaService {

	@Autowired
	private VendaRepository repo;
	
	
	
	
	public Venda find (Integer id) {
		Venda obj = repo.find(id);
		
		return repo.find(id);
	}
	
	
	public List<VendaDto> findAll() {
		List<Venda> venda = repo.findAll();
		List<VendaDto> vendaDto = new ArrayList<>();
		for (Venda a : venda) {
			VendaDto Dto = new VendaDto(a);
			vendaDto.add(Dto);
		}

		return vendaDto;
	}
	
	public Venda insert(Venda obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
	public Venda update(Venda obj) {
		find(obj.getId());
		return repo.save(obj) ;
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
