package com.jobs.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobs.Repository.VendedoresRepository;
import com.jobs.domain.Vendedores;

@Service
public class VendedoresService {

	@Autowired
	private VendedoresRepository repo;
	
	public Vendedores find (Integer id) {
		Vendedores obj = repo.find(id);
		
		return repo.find(id);
	}
}
