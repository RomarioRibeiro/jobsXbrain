package com.jobs.Resoursces;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.jobs.Service.VendaService;
import com.jobs.domain.Venda;
import com.jobs.dto.VendaDto;



@RestController
@RequestMapping(value = "/venda")
public class VendaResource {

	@Autowired
	private VendaService service;

	
	@RequestMapping(value ="/{id}", method = RequestMethod.GET)
	public ResponseEntity<Venda> find(@PathVariable Integer id) {
		Venda obj = service.find(id);
	
		return ResponseEntity.ok().body(obj);
		
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Venda obj) {
		Venda venda = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@RequestMapping(value = "/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Venda> update(@RequestBody Venda obj, @PathVariable Integer id){
		Venda venda =service.update(obj);
		venda.setId(id);
		 venda = service.update(obj);
		
		return ResponseEntity.noContent().build();
	}
	@RequestMapping(value= "/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete (@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method =RequestMethod.GET)
	
	public ResponseEntity<List<VendaDto>> findAll() {
		List<VendaDto> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
}
