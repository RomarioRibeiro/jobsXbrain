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

import com.jobs.Service.VendedoresService;
import com.jobs.domain.Vendedor;
import com.jobs.dto.VendedorDto;

@RestController
@RequestMapping(value = "/vendedor")
public class VendedoresResource {

	@Autowired
	private VendedoresService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Vendedor> find(@PathVariable Integer id) {
		Vendedor obj = service.find(id);

		return ResponseEntity.ok().body(obj);

	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Vendedor obj) {
		Vendedor vendedor = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Vendedor> update(@RequestBody Vendedor obj, @PathVariable Integer id) {
		Vendedor vendedor = service.update(obj);
		vendedor.setId(id);
		vendedor = service.update(obj);

		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(method = RequestMethod.GET)

	public ResponseEntity<List<VendedorDto>> findAll() {
		List<VendedorDto> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
