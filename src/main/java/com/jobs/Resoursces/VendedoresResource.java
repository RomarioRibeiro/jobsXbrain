package com.jobs.Resoursces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jobs.Service.VendedoresService;
import com.jobs.domain.Vendedores;



@RestController
@RequestMapping(value = "/vendedores")
public class VendedoresResource {

	@Autowired
	private VendedoresService service;

	
	@RequestMapping(value ="/{id}", method = RequestMethod.GET)
	public ResponseEntity<Vendedores> find(@PathVariable Integer id) {
		Vendedores obj = service.find(id);
	
		return ResponseEntity.ok().body(obj);
		
		
	}
	
}
