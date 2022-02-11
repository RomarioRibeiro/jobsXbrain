package com.jobs.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.jobs.Repository.ItemVendaRepository;
import com.jobs.Repository.VendaRepository;
import com.jobs.Repository.VendedoresRepository;
import com.jobs.domain.ItemVenda;
import com.jobs.domain.ItemnVendaPK;
import com.jobs.domain.Venda;
import com.jobs.domain.Vendedor;
import com.jobs.dto.VendaDto;

@Service
public class VendaService {

	@Autowired
	private VendaRepository repo;
	@Autowired
	private ItemVendaRepository repoItemVenda;
	@Autowired
	private VendedoresRepository repoVendedor;
	
	
	
	
	public Venda find (Integer id) {
		Venda obj = repo.find(id);
		
		return repo.find(id);
	}
	
	
	public List<VendaDto> findAll() {
		List<Venda> venda = repo.findAll();
		List<VendaDto> vendaDto = new ArrayList<>();
		
		for (Venda a : venda) {
			System.out.println(a.getItensVenda());
			VendaDto Dto = new VendaDto(a);
			vendaDto.add(Dto);
		}

		return vendaDto;
	}
	
	public Venda insert(VendaDto obj) {
		Venda venda = new Venda();
		venda.setId(null);
		venda.setDataDaVenda(new Date());
		System.out.println(obj.getVendedorId());
		Vendedor vend = repoVendedor.find(obj.getVendedorId());
		System.out.println(vend);
		venda.setVendedor(vend);
		repo.save(venda);
		BigDecimal totalvenda = new BigDecimal(0);
		for (ItemVenda iv : obj.getItensVenda()) {		
	        iv.setPreco(iv.getPreco().subtract(iv.getDesconto()));
	    	totalvenda = totalvenda.add(iv.getPreco().multiply(
	    			new BigDecimal(iv.getQuantidade())));
	    	ItemnVendaPK chave = new ItemnVendaPK();
	    	chave.setVenda(venda);
	    	chave.setProduto(iv.getId().getProduto());
	    	iv.setId(chave);
	        repoItemVenda.save(iv);

		}
		venda.setValorTotal(totalvenda);
		return repo.save(venda);
	}
	



	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("nao e possivel excluir um Venda que possui Venda ");
		}
	}


	public Venda update(VendaDto obj) {
		Venda venda = repo.find(obj.getId());
    	venda.setDataDaVenda(new Date());
		Vendedor vend = repoVendedor.find(obj.getVendedorId());
		venda.setVendedor(vend);
		repo.save(venda);
		BigDecimal totalvenda = new BigDecimal(0);
		repoItemVenda.deleteByIdVenda(venda.getId());
		for (ItemVenda iv : obj.getItensVenda()) {		
	        iv.setPreco(iv.getPreco().subtract(iv.getDesconto()));
	    	totalvenda = totalvenda.add(iv.getPreco().multiply(
	    			new BigDecimal(iv.getQuantidade())));
	    	ItemnVendaPK chave = new ItemnVendaPK();
	    	chave.setVenda(venda);
	    	chave.setProduto(iv.getId().getProduto());
	    	iv.setId(chave);
	        repoItemVenda.save(iv);

		}
		venda.setValorTotal(totalvenda);
		return repo.save(venda);
	}
}
